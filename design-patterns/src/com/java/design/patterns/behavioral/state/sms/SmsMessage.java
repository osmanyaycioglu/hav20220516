package com.java.design.patterns.behavioral.state.sms;


public class SmsMessage {

    private String dest;
    private String message;

    public SmsMessage(final String destParam,
                      final String messageParam) {
        super();
        this.dest = destParam;
        this.message = messageParam;
    }

    public SmsMessage() {
        // TODO Auto-generated constructor stub
    }


    public String getDest() {
        return this.dest;
    }

    public void setDest(final String destParam) {
        this.dest = destParam;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String messageParam) {
        this.message = messageParam;
    }

    @Override
    public String toString() {
        return "SmsMessage [dest=" + this.dest + ", message=" + this.message + "]";
    }


}
