package Queue;

public class LinkList {
    private Link head;
    private Link tail;

    public LinkList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insertLast(long d){
        Link newLink = new Link(d);
        if (isEmpty())
            head = newLink;
        else
            tail.next = newLink;
        tail = newLink;
    }

    public  long deleteFirst(){
        long temp = head.data;
        if (head.next == null)
            tail = null;
        head = head.next;
        return temp;
    }

    public  void displayList(){
        Link current = head;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
    }
}
