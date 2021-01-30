package Queue;

public class QueueApp {
    public static void main(String[] args){
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);

        while (!theQueue.isEmpty()){
            long n = theQueue.remove();
            System.out.print(n + " ");
        }

        System.out.println("");
    }
}
