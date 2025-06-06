package threadsconcept;

class  Counter {
    int count = 0;

    public synchronized int increment() {
        count++;
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2250; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + counter.count);
    }
}

