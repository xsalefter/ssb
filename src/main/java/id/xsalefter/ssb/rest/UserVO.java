package id.xsalefter.ssb.rest;

import id.xsalefter.ssb.domain.DataInputMethod;
import id.xsalefter.ssb.domain.DataOutputMethod;
import id.xsalefter.ssb.domain.User;
import id.xsalefter.ssb.mock.UserMock;

public class UserVO {

    private String userId;
    private DataInputMethod inputMethod;
    private String inputConnection;
    private DataOutputMethod outputMethod;
    private String outputConnection;

    // FIXME this is need to move somewhere else
    public User toUser() {
        UserMock user = new UserMock();
        user.setUserId(userId);
        user.getDataProcessingConfig().setDataInputMethod(inputMethod);
        user.getDataProcessingConfig().setDataInputConnection(inputConnection);
        user.getDataProcessingConfig().setDataOutputMethod(outputMethod);
        user.getDataProcessingConfig().setDataOutputConnection(outputConnection);
        return user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataInputMethod getInputMethod() {
        return inputMethod;
    }

    public void setInputMethod(DataInputMethod inputMethod) {
        this.inputMethod = inputMethod;
    }

    public String getInputConnection() {
        return inputConnection;
    }

    public void setInputConnection(String inputConnection) {
        this.inputConnection = inputConnection;
    }

    public DataOutputMethod getOutputMethod() {
        return outputMethod;
    }

    public void setOutputMethod(DataOutputMethod outputMethod) {
        this.outputMethod = outputMethod;
    }

    public String getOutputConnection() {
        return outputConnection;
    }

    public void setOutputConnection(String outputConnection) {
        this.outputConnection = outputConnection;
    }
}
