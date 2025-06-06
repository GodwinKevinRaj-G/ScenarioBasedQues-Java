package threadsconcept;

class MyNewThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable...");
    }
}

public class ThreadsRunnableConcept {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyNewThread());
        thread.start();
    }
}
