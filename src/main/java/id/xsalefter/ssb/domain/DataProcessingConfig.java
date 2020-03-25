package id.xsalefter.ssb.domain;

public interface DataProcessingConfig {

    DataInputMethod getDataInputMethod();
    String getDataInputConnection();
    DataOutputMethod getDataOutputMethod();
    String getDataOutputConnection();

    // TODO We may need more attribute here. For example, username/password for
    //  database, table target, bucket name, etc. But enough for now
}