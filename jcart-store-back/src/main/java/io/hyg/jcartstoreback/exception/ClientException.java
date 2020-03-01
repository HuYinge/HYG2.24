package io.hyg.jcartstoreback.exception;

import javax.servlet.ServletException;

public class ClientException extends ServletException {
    private String errCode;

    public ClientException(String errCode, String errMsg){
        super(errMsg);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

}
