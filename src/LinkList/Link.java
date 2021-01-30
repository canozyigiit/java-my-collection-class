package LinkList;

import java.awt.desktop.SystemSleepEvent;

public class Link {
    public long data;
    public Link next;

    public Link(long d){
        data=d;
    }

    public void displayLink(){
        System.out.print(data + " ");
    }
}
