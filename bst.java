import java.util.Scanner;

public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Invalid input. Exiting.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                tree.insert(val);
            } else {
                System.out.println("Invalid input detected. Exiting.");
                break;
            }
        }
        sc.close();

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.print("Preorder traversal: ");
        tree.preorder();

        System.out.print("Postorder traversal: ");
        tree.postorder();
    }
}
