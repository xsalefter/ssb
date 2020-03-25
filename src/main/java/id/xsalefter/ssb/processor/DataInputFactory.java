package id.xsalefter.ssb.processor;

import id.xsalefter.ssb.domain.DataInputMethod;

public interface DataInputFactory {
    DataInput getDataInput(DataInputMethod method, String connection);
}
