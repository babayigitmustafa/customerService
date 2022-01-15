package core.concretes;

import core.abstracts.LoggerService;

public class LoggerManager implements LoggerService {

    public LoggerManager() {
    }

    @Override
    public void log() {
        System.out.println("test");
    }
}
