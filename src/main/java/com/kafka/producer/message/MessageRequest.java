package com.kafka.producer.message;

import java.io.Serializable;

public class MessageRequest implements Serializable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
