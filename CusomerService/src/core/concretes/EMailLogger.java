package core.concretes;

import core.abstracts.LoggerService;

public class EMailLogger implements LoggerService {

    @Override
    public void log() {
        System.out.println("E mail ile loglandı ");
    }

}
