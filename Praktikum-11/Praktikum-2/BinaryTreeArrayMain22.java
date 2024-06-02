public class BinaryTreeArrayMain22 {
    public static void main(String[] args) {
        BinaryTreeArray22 bta = new BinaryTreeArray22();
        bta.add(10);
        bta.add(20);
        bta.add(30);
        bta.add(40);
        bta.add(50);

        System.out.println("Binary Tree Array");

        System.out.print("InOrder traversal : ");
        bta.traverseInOrder(bta.root);
        System.out.println("");

        System.out.print("PreOrder traversal :");
        bta.traversePreOrder(bta.root);
        System.out.println("");

        System.out.print("PostOrder traversal : ");
        bta.traversePostOrder(bta.root);
        System.out.println("");
    }
}
