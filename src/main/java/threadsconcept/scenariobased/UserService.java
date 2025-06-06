package threadsconcept.scenariobased;

class EmailSender implements Runnable {
    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    public void run() {
        System.out.println("Sending email to " + email);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email sent to " + email);
    }
}

public class UserService {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("User registration started...");

//        try {
            Thread.sleep(1000);
//        } catch (InterruptedException e) {}

        System.out.println("User registration completed.");

        Thread emailThread = new Thread(new EmailSender("user@example.com"));
        emailThread.start();
    }
}
