import org.w3c.dom.Node;

public class BinaryTree22 {
    Node22 root;

    public BinaryTree22() {
        root = null;
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

    boolean find(int data) {
        boolean result = false;
        Node22 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true; // result akan menjadi true jika current.data sama dengan data
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
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

    void traverseInOrder(Node22 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node22 getSuccessor(Node22 del) {
        Node22 successor = del.right;
        Node22 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successorParent;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node22 parent = root;
        Node22 current = root;
        boolean isLeftChild = false;
        while (current != null && current.data != data) { // tambah kondisi untuk menemukan data. if current.data != data, maka dia akan looping hingga menemukan data
            if (current.data == data) {
                break; // jika data telah ditemukan, maka akan dilakukan break untuk menghentikan looping
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }

            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            } else {
                if (current.left == null && current.right == null) {
                    if (current == root) {
                        root = null;
                    } else {
                        if (isLeftChild) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                } else if (current.left == null) {
                    if (current == root) {
                        root = current.right;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                } else if (current.right == null) {
                    if (current == root) {
                        root = current.left;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else {
                    Node22 successor = getSuccessor(current);
                    if (current == root) {
                        root = successor;
                    } else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }
    Node22 addRecursive(Node22 current, int data) {
        if (current == null) {
            return new Node22(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // Nilai sudah ada dalam pohon
            return current;
        }
        return current;
    }

    public int cariMinValue() {
        if (root == null) {
            System.out.println("Tree masih kosong!");
        }
        Node22 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int cariMaxValue() {
        if (root == null) {
            System.out.println("Tree masih kosong!");
        }
        Node22 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void printLeafNodes(Node22 nd) {
        if (nd == null) {
            return;
        }

        if (nd.left == null && nd.right == null) {
            System.out.print(nd.data + " ");
        }

        printLeafNodes(nd.left);
        printLeafNodes(nd.right);
    }

    int countLeaf(Node22 nd) {
        if (nd == null) {
          return 0;
        }
        if (nd.left == null && nd.right == null) {
          return 1;
        }
        return countLeaf(nd.left) + countLeaf(nd.right);
    }
}