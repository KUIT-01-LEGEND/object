package theater;

public class Bag {
    private Long amount;        // 고객이 가지고 있는 금액
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount){
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public boolean hasAmount(Long amount){
        return this.amount > amount;
    }

    public boolean minusAmount(Long amount) {
        if (this.amount < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }
}
