package id.xsalefter.ssb.mock.processor.impl;

import id.xsalefter.ssb.processor.DataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonFileDataInput implements DataInput {

    private final Logger log = LoggerFactory.getLogger(JsonFileDataInput.class);
    private final String connection;

    public JsonFileDataInput(final String connection) {
        this.connection = connection;
    }

    @Override
    public Object getData() {
        log.info(">> Invoking JsonFileDataInput#getData(). Connection value: {}", this.connection);
        return new Object();
    }
}
