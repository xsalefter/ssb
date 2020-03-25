package id.xsalefter.ssb.processor;

import id.xsalefter.ssb.domain.DataOutputMethod;

public interface DataOutputFactory {
    DataOutput getDataOutput(DataOutputMethod method, String connection, Object dataToProcess);
}
