package LinkList;

public class LinkList {
    private Link head;
    private Link tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertToHead(long d) {
        Link newLink = new Link(d);
        if (isEmpty())
            tail = newLink;
        newLink.next = head;
        head = newLink;
    }

    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty())
            head = newLink;
        else
            tail.next = newLink;
        tail = newLink;
    }

    public long deleteFromHead() {
        long temp = head.data;
        if (head.next == null)
            tail = null;
        head = head.next;
        return temp;
    }

    public void displayList() {
        System.out.print("Liste (head-->tail): ");
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void insertSorted(long data) {
        Link previous = null;
        Link current = head;
        Link newLink = new Link(data);
        while (current != null && data > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null)
            head = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    public long deleteFromTail() {
        long data = tail.data;
        if (head == tail)
            head = tail = null;
        else {
            Link current = head;
            while (current.next != tail)
                current = current.next;
            tail = current;
            tail.next = null;
        }
        return data;
    }

    public void delete(long data) {
        if (!isEmpty())
            if (head == tail && data == head.data)
                head = tail = null;
            else if (data == head.data)
                head = head.next;
            else {
                Link previous = head;
                Link current = head.next;
                while (current != null && current.data != data) {
                    previous = previous.next;
                    current = current.next;
                }

                //for (previous = head, current = head.next; current != null && current.data !=data;previous=previous.next,current=current.next)

                if (current != null) {
                    previous.next = current.next;
                    if (current == tail)
                        tail = previous;
                }
            }
    }

    public Link find(long data) {
        if (head == null)
            return null;
        else {
            Link current = head;
            while (current.data != data && current.next != null) {
                current = current.next;
            }
            return current;
        }
    }

    public Link getMax() {
        if (head == null)
            return null;
        else {
            Link max = head;
            Link current = head.next;
            while (current != null) {
                if (current.data > max.data)
                    max = current;
                current = current.next;
            }
            return max;
        }
    }

    public boolean removeMax() {
        if (getMax() == null) {
            System.out.println("Liste Boş");
            return false;
        } else {
            delete(getMax().data);
            return true;
        }
    }

//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
    public int size(){
        Link current = head;
        int count = 0;
        while (current !=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public long[] toArray(){
        long[] array = new long[size()*2];
        Link current = head;
        int i=0;
        while (current != null){
            array[i]= current.data;
            i++;
            current = current.next;
        }
        return array;
    }

    public boolean deleteith(int order){
        int counter = 2;
        if(!isEmpty()){
            if(head == tail && order == 1){
                head = tail = null;
                return true;
            }
            else if (order == 1){
                head = head.next;
                return true;
            }
            else {
                Link previous = head;
                Link current = head.next;
                while (current != null && counter != order){
                    previous = previous.next;
                    current = current.next;
                    counter++;
                }

                if (current != null){
                    previous.next = current.next;
                    if(current == tail)
                        tail = previous;
                    return true;
                }
                else return false;
            }
        }
        return false;
    }

    public boolean deleteFromList(LinkList dataList, LinkList orderList){
        if (!isEmpty()){
            int deleted = 0;
            Link current = orderList.getHead();
            while(current != null){
                dataList.deleteith((int)current.data-deleted);
                deleted++;
                current = current.next;
            }
            return true;
        }
        return false;
    }




    public void subList(long first, long last) {
        head = find(first);
        tail = find(last);
        tail.next = null;
    }



    public void dispRec(Link head) {
        if (head == null)
            return;
        head.displayLink();
        dispRec(head.next);
    }

    public Link insertLastRec(Link head, long d) {
        if (head == null)
            return new Link(d);
        head.next = insertLastRec(head.next, d);
        return head;
    }

    public boolean findRec(Link head, long key) {
        if (head == null)
            return false;
        if (head.data == key)
            return true;
        return findRec(head.next, key);
    }

    public Link getHead() {
        return this.head;
    }

    public void list(Link head) {
        if (head == null)
            return;
        list(head.next);
        System.out.print(head.data);
    }
}
