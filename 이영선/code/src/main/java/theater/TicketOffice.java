package theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {     // 매표소
    private Long amount;       // 매표소에 남아있는 돈
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

}
