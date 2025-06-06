package threadsconcept;

public class EmailNotificationSimulator {
    public static void main(String[] args) {
        String[] users = {"Alice", "Bob", "Charlie", "David", "Eva"};

        for (String user : users) {
            System.out.println("Sending email to: " + user);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping.");
            }
        }

        System.out.println("All emails sent!");
    }
}

