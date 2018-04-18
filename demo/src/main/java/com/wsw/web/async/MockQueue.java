package com.wsw.web.async;

import org.springframework.stereotype.Component;

@Component
public class MockQueue {

    private String placeHolder;

    private String completeHolder;

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) throws Exception{
        System.out.println("下单");
        this.placeHolder = placeHolder;
        Thread.sleep(1000);
        this.completeHolder = placeHolder;
        System.out.println("下单请求完成");
    }

    public String getCompleteHolder() {
        return completeHolder;
    }

    public void setCompleteHolder(String completeHolder) {
        this.completeHolder = completeHolder;
    }
}
