package ArrayList1;

public class LinkList {
    private Link head;

    public LinkList(){
        head=null;
    }

    public void insertToHead(int id, double dd){
        Link newLink = new Link(id,dd);
        newLink.next = head;
        head =newLink;
    }

    public Link deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp;
    }

    public void displayList(){
        System.out.println("Liste:");
        Link current = head;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public boolean isEmpty(){
        return (head == null);
    }

}
