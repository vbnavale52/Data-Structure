public class Main {
    public static void main(String [] args) {

        LinkedList l1 = new LinkedList();

        l1.display();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.display();

        l1.insert(50, 1);
        l1.display();
        l1.insert(60, 4);
        l1.display();
        l1.insert(70, 7);
        l1.display();
        l1.insert(80, -1);
        l1.display();
        l1.insert(90, 9);
        l1.display();

        l1.deleteByPosition(1);
        l1.display();
        l1.deleteByPosition(3);
        l1.display();
        l1.deleteByPosition(5);
        l1.display();
        l1.deleteByPosition(5);
        l1.display();
        l1.deleteByPosition(10);
        l1.display();

    }
}
