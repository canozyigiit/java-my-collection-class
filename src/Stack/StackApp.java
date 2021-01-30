package Stack;

public class StackApp {
    public static void main(String[] args){
        StackX theStack = new StackX(10);
        theStack.push('s');
        theStack.push('a');
        theStack.push('d');
        theStack.push('a');

        while (!theStack.isEmpty()){
            char value = theStack.pop();

            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
