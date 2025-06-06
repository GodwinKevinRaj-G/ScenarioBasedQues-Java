package threadsconcept;

class OwnThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("My Own Thread Is Running!!");
    }
}
public class ThreadClassConcept
{
    public static void main(String[] args) {

        new OwnThread().run();
    }
}
