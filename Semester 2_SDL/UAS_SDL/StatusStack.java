package UAS_SDL;

public class StatusStack {
    private StackNode top;

    public boolean empty() {
        return top == null;
    }
    public void push(Status status) {
        StackNode newNode = new StackNode(status);

        newNode.next = top;
        top = newNode;
    }
    public Status pop() {
        if (empty()) {
            return null;
        }
        Status temp = top.data;
        top = top.next;
        return temp;
    }
    public void tampilRiwayat(){
        StackNode current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
