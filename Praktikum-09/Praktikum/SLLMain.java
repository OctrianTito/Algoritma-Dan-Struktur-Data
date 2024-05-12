/**
 * SLLMain
 */
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singSLL = new SingleLinkedList();
        singSLL.print();
        singSLL.addFirst(890);
        singSLL.print();
        singSLL.addLast(760);
        singSLL.print();
        singSLL.addFirst(700);
        singSLL.print();
        singSLL.insertAfter(700, 999);
        singSLL.print();
        singSLL.insertAt(3, 833);
        singSLL.print();

        System.out.println("Data pada index ke-1 = " + singSLL.getData(1));
        System.out.println("Data 3 berada pada index ke-" + singSLL.indexOf(760));

        singSLL.print();
        singSLL.remove(999);
        singSLL.print();
        singSLL.removeAt(0);
        singSLL.print();
        singSLL.removeFirst();
        singSLL.print();
        singSLL.removeLast();
        singSLL.print();

        


    }
}