package id.xsalefter.ssb.processor;

import id.xsalefter.ssb.domain.DataInputMethod;
import id.xsalefter.ssb.domain.DataOutputMethod;
import id.xsalefter.ssb.domain.User;
import id.xsalefter.ssb.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataProcessor {

    private final Logger log = LoggerFactory.getLogger(DataProcessor.class);

    private final UserRepository userRepository;
    private final DataInputFactory dataInputFactory;
    private final DataOutputFactory dataOutputFactory;

    public DataProcessor(UserRepository userRepository,
                         DataInputFactory dataInputFactory,
                         DataOutputFactory dataOutputFactory) {
        this.userRepository = userRepository;
        this.dataInputFactory = dataInputFactory;
        this.dataOutputFactory = dataOutputFactory;
    }

    // .... then every few seconds, the app will bring the data ....
    @Scheduled(fixedRate = 5000)
    public void process() {
        if (userRepository.hasData()) {
            userRepository.findUsersWithDataConfig().forEach(user -> {
                DataInput dataInput = getDataInput(user);
                DataOutput dataOutput = getDataOutput(user, dataInput.getData());
                dataOutput.process();

                log.info("\n");
            });
        }
    }

    private DataInput getDataInput(User user) {
        DataInputMethod method = user.getDataProcessingConfig().getDataInputMethod();
        String inputConnection = user.getDataProcessingConfig().getDataInputConnection();
        return dataInputFactory.getDataInput(method, inputConnection);
    }

    private DataOutput getDataOutput(User user, Object data) {
        DataOutputMethod method = user.getDataProcessingConfig().getDataOutputMethod();
        String outputConnection = user.getDataProcessingConfig().getDataOutputConnection();
        return dataOutputFactory.getDataOutput(method, outputConnection, data);
    }
}
