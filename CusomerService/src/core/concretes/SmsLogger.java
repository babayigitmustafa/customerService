package core.concretes;

import core.abstracts.LoggerService;

public class SmsLogger extends LoggerManager implements LoggerService {


    @Override
    public void log() {
        System.out.println("Sms ile loglandı ");
    }
}
