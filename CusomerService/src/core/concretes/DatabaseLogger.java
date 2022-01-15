package core.concretes;

import core.abstracts.LoggerService;

public class DatabaseLogger implements LoggerService {


    @Override
    public void log() {
        System.out.println("Database ile loglandı ");

    }
}
