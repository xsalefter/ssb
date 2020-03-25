package id.xsalefter.ssb.mock.processor.impl;

import id.xsalefter.ssb.processor.DataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChunkDataInput implements DataInput {

    private final Logger log = LoggerFactory.getLogger(ChunkDataInput.class);
    private final String connection;

    public ChunkDataInput(final String connection) {
        this.connection = connection;
    }

    @Override
    public Object getData() {
        log.info(">> Invoking ChunkDataInput#getData(). Connection value: {}", this.connection);
        return new Object();
    }
}
