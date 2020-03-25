package id.xsalefter.ssb.mock.processor;

import id.xsalefter.ssb.domain.DataInputMethod;
import id.xsalefter.ssb.mock.processor.impl.ChunkDataInput;
import id.xsalefter.ssb.mock.processor.impl.JsonFileDataInput;
import id.xsalefter.ssb.processor.DataInput;
import id.xsalefter.ssb.processor.DataInputFactory;
import org.springframework.stereotype.Component;

@Component
public class DataInputFactoryMock implements DataInputFactory {

    @Override
    public DataInput getDataInput(DataInputMethod method, String connection) {
        switch (method) {
            case JSON_FILE: return new JsonFileDataInput(connection);
            case CHUNK: return new ChunkDataInput(connection);
            default: throw new IllegalStateException("Unknown DataInputMethod instance");
        }
    }
}
