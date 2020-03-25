package id.xsalefter.ssb.mock;

import id.xsalefter.ssb.domain.User;

public class UserMock implements User {

    private String userId;
    private DataProcessingConfigMock dataProcessingConfig = new DataProcessingConfigMock();

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public DataProcessingConfigMock getDataProcessingConfig() {
        return dataProcessingConfig;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
