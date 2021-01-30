package DoublyLinledList;

public class DoublyLinkedListApp {
    public static void main(String[] args){
        DoublyLinkedList theList = new DoublyLinkedList();
        for (int i = 0;i < 10 ; i++)
            theList.insertSorted((int)(java.lang.Math.random()*99));
        theList.displayForward();


//        theList.insertFirst(22);
//        theList.insertFirst(44);
//        theList.insertFirst(66);
//
//        theList.insertToTail(11);
//        theList.insertToTail(33);
//        theList.insertToTail(55);
//        theList.insertToTail(66);
//        theList.insertToTail(77);
//
//        theList.displayForward();
//        theList.setMax(55);
//        theList.displayForward();
//
//
////        theList.displayBackward();
////
////        theList.deleteFirst();
////        theList.deleteFromTail();
////        theList.delete(11);
////
////        theList.displayForward();
    }
}
