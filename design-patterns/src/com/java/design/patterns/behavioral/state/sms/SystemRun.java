package com.java.design.patterns.behavioral.state.sms;


public class SystemRun {

    public static void main(final String[] args) {
        SystemState stateLoc = new SystemState();
        stateLoc.sendSms("100001",
                         "message1");
        stateLoc.sendSms("100002",
                         "message2");
        stateLoc.suspend();
        stateLoc.sendSms("100003",
                         "message3");
        stateLoc.sendSms("100004",
                         "message4");
        stateLoc.running();
        stateLoc.sendSms("100005",
                         "message5");
        stateLoc.sendSms("100006",
                         "message6");
        stateLoc.suspend();
        stateLoc.sendSms("100007",
                         "message7");
        stateLoc.sendSms("100008",
                         "message8");
        stateLoc.error();
        stateLoc.sendSms("100009",
                         "message9");
        stateLoc.sendSms("1000010",
                         "message10");
        stateLoc.running();
        stateLoc.sendSms("1000011",
                         "message11");
        stateLoc.sendSms("1000012",
                         "message12");
    }
}
