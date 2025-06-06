package threadsconcept.scenariobased;

class TicketCounter {
    private int availableTickets = 2;

    public synchronized void bookTicket(String customerName, int requestedTickets) {
        System.out.println(customerName + " trying to book " + requestedTickets + " tickets...");

        if (availableTickets >= requestedTickets) {
            System.out.println("Tickets available. Booking in progress...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets -= requestedTickets;
            System.out.println(customerName + " successfully booked " + requestedTickets + " ticket(s).");
        } else {
            System.out.println("Sorry " + customerName + ", not enough tickets available.");
        }
    }
}

class BookingThread extends Thread {
    private final TicketCounter counter;
    private final String customerName;
    private final int tickets;

    public BookingThread(TicketCounter counter, String customerName, int tickets) {
        this.counter = counter;
        this.customerName = customerName;
        this.tickets = tickets;
    }

    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter.bookTicket(customerName, tickets);
    }
}

public class TicketBookingApp{
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        BookingThread customer1 = new BookingThread(counter, "Kevin", 1);
        BookingThread customer2 = new BookingThread(counter, "Manu", 2);

        customer1.start();
        customer2.start();
    }
}

