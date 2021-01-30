package ArrayList1;

public class LinkListApp {
    public static void main(String[] args){
        LinkList theList = new LinkList();

        theList.insertToHead(1,11.11);
        theList.insertToHead(2,5.99);
        theList.insertToHead(3,6.11);
        theList.insertToHead(4,8.55);

        theList.displayList();

        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Silinen:");
            aLink.displayLink();
        }
        theList.displayList();
    }
}
