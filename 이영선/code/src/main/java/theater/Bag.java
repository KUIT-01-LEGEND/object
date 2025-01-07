package theater;

public class Bag {
    private Long amount;        // 고객이 가지고 있는 금액
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount){
        this.amount = amount;
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    private boolean hasTicket() {
        return this.invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private boolean hasAmount(Long amount){
        return this.amount > amount;
    }

    private boolean minusAmount(Long amount) {
        if (this.amount < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }
        if (!hasAmount(ticket.getFee())) {
            throw new IllegalArgumentException("손님이 돈이 없습니다.");
        }
        minusAmount(ticket.getFee());
        setTicket(ticket);
        return ticket.getFee();
    }
}
