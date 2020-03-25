package id.xsalefter.ssb.mock.processor.impl;

import id.xsalefter.ssb.processor.DataOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AwsS3DataOutput implements DataOutput {

    private final Logger log = LoggerFactory.getLogger(AwsS3DataOutput.class);
    private final String connection;
    private final Object dataInput;

    public AwsS3DataOutput(final String connection, Object dataToProcess) {
        this.connection = connection;
        this.dataInput = dataToProcess;
    }

    @Override
    public void process() {
        log.info(">> Invoking AwsS3DataOutput#process(). Connection value: {}, Data to process: {}", this.connection, this.dataInput);
    }
}
