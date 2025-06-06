package threadsconcept.scenariobased;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LoggerTask implements Runnable {
    private String message;

    public LoggerTask(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Logging: " + message + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
}

public class LoggingApp {
    public static void main(String[] args) {
        ExecutorService logger = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            logger.execute(new LoggerTask("Action #" + i));
        }

        logger.shutdown();
        System.out.println("Main process done.");
    }
}
