package LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        long[] array = new long[theList.size()*2];
        LinkList orderList = new LinkList();

        orderList.insertLast(1);
        orderList.insertLast(2);
        orderList.insertLast(4);

        theList.insertLast(1);
        theList.insertLast(2);
        theList.insertLast(3);
        theList.insertLast(4);
        theList.insertLast(5);
        theList.insertLast(6);
        theList.insertLast(7);

        theList.displayList();

        System.out.println("Liste büyüklüğü: "+theList.size());

        array = theList.toArray();

        for(int i = 0; i < theList.size(); i++)
            System.out.print(array[i]+" ");

        theList.deleteFromList(theList,orderList);
        theList.displayList();

//        theList.deleteith(1);
//        theList.displayList();
//        theList.deleteith(3);
//        theList.displayList();

        //LinkList sorted = new LinkList();
        //theList.list(theList.getHead());

//        theList.displayList();
//        theList.insertToHead(22);
//        theList.insertToHead(44);
//        theList.insertToHead(66);
//
//        theList.insertLast(11);
//        theList.insertLast(33);
//        theList.insertLast(55);
//
//        System.out.println(theList.size());
//
//        long[] dizi = theList.toArray();
//
//        for (int i = 0;i < theList.size() ;i++ )
//            System.out.print(dizi[i]+"-");
//
//        theList.displayList();
//        while (theList.getMax() != null) {
//            sorted.insertToHead(theList.getMax().data);
//            theList.removeMax();
//        }
//        System.out.println("1.Liste");
//        theList.displayList();
//        System.out.println("2.Liste");
//        sorted.displayList();
//        theList = sorted;
//        theList.displayList();
//
//        theList.subList(22, 55);
//        theList.displayList();

//        theList.deleteFromTail();
//        theList.displayList();
//        while (!theList.isEmpty())
//            sorted.insertSorted(theList.deleteFromHead());
//
//        sorted.displayList();
//        theList=sorted;
//        theList.displayList();
//
//        theList.displayList();
//
//        theList.delete(33);
//        theList.displayList();
//        theList.delete(66);
//        theList.displayList();

    }
}
