/**
 * BinaryTreeMain22
 */
public class BinaryTreeMain22 {

    public static void main(String[] args) {
        BinaryTree22 bt = new BinaryTree22();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal\t: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal\t: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal\t: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal\t: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("Nilai Minimum : " + bt.cariMinValue());
        System.out.println("Nilai Maximum : " + bt.cariMaxValue());

        System.out.println("-----------------------------------------------");

        System.out.println("Node Leaf");
        bt.printLeafNodes(bt.root);
        System.out.println("");
        System.out.println("Jumlah Node Leaf : " + bt.countLeaf(bt.root));
    }
}