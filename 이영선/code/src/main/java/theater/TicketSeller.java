package theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        Long ticketPrice = audience.buy(ticket);
        ticketOffice.plusAmount(ticketPrice);
    }
}
