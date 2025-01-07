package theater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;
        }
        if (bag.hasAmount(ticket.getFee())){
            bag.minusAmount(ticket.getFee());
            bag.setTicket(ticket);
            return ticket.getFee();
        }
    }
}
