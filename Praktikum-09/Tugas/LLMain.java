public class LLMain {
    public static void main(String[] args) {
        SLL22 mhs = new SLL22();

        mhs.addFirst(111, "Anton"); 
        mhs.print();
        
        mhs.addLast(112, "Prita"); 
        mhs.print();

        mhs.addFirst(113, "Yusuf"); 
        mhs.print();
        
        mhs.insertAfter(112, 114, "Doni"); 
        mhs.print();
        
        mhs.insertAt(3, 115, "Sari"); 
        mhs.print();

        System.out.println("Data pada index ke-1 :");
        System.out.println("Nama : " + mhs.getDataNama(1) );
        System.out.println("NIM : " + mhs.getDataNim(1));
        System.out.println("Data 3 berada pada index ke-" + mhs.indexOf(112));

        mhs.print();
        mhs.remove(115);
        mhs.print();
        mhs.removeAt(0);
        mhs.print();
        mhs.removeFirst();
        mhs.print();
        mhs.removeLast();
        mhs.print();
    }
}
