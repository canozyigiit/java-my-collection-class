package Stack;

public class LinkStackApp {
    public static void main(String[] args){
        LinkStack theStack = new LinkStack();

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();

        System.out.println(theStack.peek());
        theStack.pop();
        System.out.println(theStack.peek());
    }
}
