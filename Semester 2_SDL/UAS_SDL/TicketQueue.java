package UAS_SDL;

public class TicketQueue {
    private TicketNode front;
    private TicketNode rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Ticket ticket) {
        TicketNode newNode = new TicketNode(ticket);

        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        if (ticket.getSLATime() < front.data.getSLATime()) {
            newNode.next = front;
            front = newNode;
            return;
        }
        TicketNode current = front;

        while (current.next != null &&
                current.next.data.getSLATime() <= ticket.getSLATime()) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            rear = newNode;
        }
    }

    public Ticket dequeue() {
        if (isEmpty()) {
            System.out.println("antrean kosong");
            return null;
        }
        Ticket temp = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return temp;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            System.out.println("=== TIKET PALING DEPAN ===");
            front.data.tampilTiket();
        }
    }

    public void tampilSemuaTicket() {
        TicketNode current = front;
        while (current != null) {
            current.data.tampilTiket();
            current = current.next;
        }
    }
    public Ticket cariTicket(String id) {
        TicketNode current = front;

        while (current != null) {
            if (current.data.getTiketID().equalsIgnoreCase(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void laporanTiket() {
        int total = 0;
        int menunggu = 0;
        int diproses = 0;
        int selesai = 0;
        TicketNode current = front;

        while (current != null) {
            total++;
            String status = current.data.getStatus();

            if(status.equalsIgnoreCase("Menunggu")){
                menunggu++;
            }
            else if(status.equalsIgnoreCase("Diproses")){
                diproses++;
            }
            else if(status.equalsIgnoreCase("Selesai")){
                selesai++;
            }
            current = current.next;
        }

        System.out.println("\n=== LAPORAN TIKET ===");
        System.out.println("Total Tiket : " + total);
        System.out.println("Menunggu    : " + menunggu);
        System.out.println("Diproses    : " + diproses);
        System.out.println("Selesai     : " + selesai);
    }
}