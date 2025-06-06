package threadsconcept;

import java.util.concurrent.*;

/**
 * Explanation:
 * - You have 2 threads available in the pool.
 * - 5 tasks are submitted using a loop.
 * - The first 2 tasks are immediately picked up by the 2 threads.
 * - The remaining 3 tasks are placed in a queue and are executed
     as soon as any of the 2 threads becomes free.
 */

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            Runnable task = () -> System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
            service.execute(task);
        }
        service.shutdown();
    }
}

