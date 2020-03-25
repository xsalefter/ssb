package id.xsalefter.ssb.mock;

import id.xsalefter.ssb.domain.DataInputMethod;
import id.xsalefter.ssb.domain.DataOutputMethod;
import id.xsalefter.ssb.domain.DataProcessingConfig;

public class DataProcessingConfigMock implements DataProcessingConfig {

    private DataInputMethod dataInputMethod;
    private String dataInputConnection;
    private DataOutputMethod dataOutputMethod;
    private String dataOutputConnection;

    @Override
    public DataInputMethod getDataInputMethod() {
        return dataInputMethod;
    }

    public void setDataInputMethod(DataInputMethod dataInputMethod) {
        this.dataInputMethod = dataInputMethod;
    }

    @Override
    public String getDataInputConnection() {
        return dataInputConnection;
    }

    public void setDataInputConnection(String dataInputConnection) {
        this.dataInputConnection = dataInputConnection;
    }

    @Override
    public DataOutputMethod getDataOutputMethod() {
        return dataOutputMethod;
    }

    public void setDataOutputMethod(DataOutputMethod dataOutputMethod) {
        this.dataOutputMethod = dataOutputMethod;
    }

    @Override
    public String getDataOutputConnection() {
        return dataOutputConnection;
    }

    public void setDataOutputConnection(String dataOutputConnection) {
        this.dataOutputConnection = dataOutputConnection;
    }
}
