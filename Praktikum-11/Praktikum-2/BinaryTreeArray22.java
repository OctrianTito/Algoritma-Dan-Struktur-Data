/**
 * BinaryTreeArray22
 */
public class BinaryTreeArray22 {
    Node22 root;
    int [] data;
    int idxLast;

    public BinaryTreeArray22() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(Node22 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node22(data);
        } else {
            Node22 current = root;
            while (true) {
                if (data < current.data) { // untuk kondisi data < current.data, maka data akan masuk ke left
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node22(data);
                        break;
                    }
                } else if (data > current.data) { // untuk kondisi data > current.data, maka data akan masuk ke right
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node22(data);
                        break;
                    }
                } else {
                    System.out.println("Mohon maaf data yang dimasukkan sudah ada!");
                    break;
                }
            }
        }
    }

    void traversePreOrder(Node22 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        } 
    }

    void traversePostOrder(Node22 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
}