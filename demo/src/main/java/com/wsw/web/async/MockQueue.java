package com.wsw.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MockQueue {

    private String placeHolder;

    private String completeHolder;

    private Logger logger = LoggerFactory.getLogger(MockQueue.class);

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) throws Exception{
        new Thread(() -> {
            logger.info("下单");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.completeHolder = placeHolder;
            logger.info("下单请求完成");
        }).start();
    }

    public String getCompleteHolder() {
        return completeHolder;
    }

    public void setCompleteHolder(String completeHolder) {
        this.completeHolder = completeHolder;
    }
}
