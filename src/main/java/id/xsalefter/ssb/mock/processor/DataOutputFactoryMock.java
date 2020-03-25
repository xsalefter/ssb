package id.xsalefter.ssb.mock.processor;

import id.xsalefter.ssb.domain.DataOutputMethod;
import id.xsalefter.ssb.mock.processor.impl.AwsS3DataOutput;
import id.xsalefter.ssb.mock.processor.impl.PostgreSQLDataOutput;
import id.xsalefter.ssb.processor.DataOutput;
import id.xsalefter.ssb.processor.DataOutputFactory;
import org.springframework.stereotype.Component;

@Component
public class DataOutputFactoryMock implements DataOutputFactory {

    @Override
    public DataOutput getDataOutput(DataOutputMethod method, String connection, Object dataToProcess) {
        switch (method) {
            case AWS_S3: return new AwsS3DataOutput(connection, dataToProcess);
            case POSTGRESQL: return new PostgreSQLDataOutput(connection, dataToProcess);
            default: throw new IllegalStateException("Unknown DataOutputMethod instance.");
        }
    }
}
