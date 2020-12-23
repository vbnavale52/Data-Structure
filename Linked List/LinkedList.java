public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if( newNode == null) {
            return false;
        }

        //check if the list is empty
        if(head == null) {
            head = newNode;
            return true;
        }

        //insert node at the end of the list
        Node last = head;
        while( last.getNext() != null ) {
            last = last.getNext();
        }

        //last is referring to last node in the list
        last.setNext(newNode);

        return true;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print( temp.getData()  + " ");
            temp = temp.getNext();
        }
        System.out.println();

    }

    public boolean insert(int data, int position) {

        if(position <= 0) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //position is other than 1

        //1. Locate node at pos - 1 i.e. prev
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        //2
        newNode.setNext(prev.getNext());
        //3
        prev.setNext(newNode);

        return true;
    }

    boolean deleteByPosition(int position) {

        if(head == null || position <= 0) {
            return false;
        }

        if(position == 1) {
            head = head.getNext();
            return true;
        }

        //if pos > 1
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }
        Node del = prev.getNext();
        if(del == null) {
            return false;
        }

        prev.setNext(del.getNext());

        return true;
    }
}
