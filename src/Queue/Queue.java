package Queue;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int elemanSayisi;

    public Queue(int s){
        maxSize = s;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        elemanSayisi = 0;
    }

    public void insert(long d){
        if (rear == maxSize -1)
            rear = -1;
        queueArray[++rear] = d;
        elemanSayisi++;
    }

    public long remove(){
        long temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
        elemanSayisi--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return elemanSayisi == 0;
    }

    public boolean isFull(){
        return elemanSayisi==maxSize;
    }

    public int size(){
        return elemanSayisi;
    }
}
