package com.wsw.security.browser.support;

public class SimpleResponse {
    private Object content;

    public Object getObject() {
        return content;
    }

    public void setObject(Object object) {
        this.content = object;
    }

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
