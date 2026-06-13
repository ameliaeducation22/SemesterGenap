package UAS_SDL;

public class TicketNode {
    Ticket data;
    TicketNode next;

    public TicketNode(Ticket data) {
        this.data = data;
        this.next = null;
    }
}
