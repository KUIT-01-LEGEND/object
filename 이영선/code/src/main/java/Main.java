import theater.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Long ticketPrice = 8000L;
        List<Ticket> tickets = initializeTickets(ticketPrice);
        List<Audience> audiences = initializeAudiences();

        TicketOffice ticketOffice = new TicketOffice(ticketPrice, tickets);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        for (Audience audience : audiences) {
            theater.enter(audience);
        }
    }

    private static List<Audience> initializeAudiences() {
        List<Audience> audiences = new ArrayList<>();
        audiences.add(new Audience(new Bag(129000L)));
        audiences.add(new Audience(new Bag(123234L)));
        audiences.add(new Audience(new Bag(91000L)));
        audiences.add(new Audience(new Bag(8000L)));
        audiences.add(new Audience(new Bag(17300L)));
        audiences.add(new Audience(new Bag(937000L)));
        return audiences;
    }

    private static List<Ticket> initializeTickets(Long ticketPrice) {
        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tickets.add(new Ticket(ticketPrice));
        }
        return tickets;
    }
}
