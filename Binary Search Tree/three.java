package BST;

public class three {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // build the bse
    public static Node build(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = build(root.right, val);
        } else {
            root.left = build(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // delete the node
    public static Node deleteNode(Node root, int val) {
        // search
        if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {
            // case 1 : leaf node
            // the node is leaf node means both right and left childrens are null
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 : one child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // case 3 : two childrens
            Node IS = findInOrderSuccessor(root.right);// bcz it is left most node in right subtree
            root.data = IS.data;// replace the data of root with successor data
            root.right = deleteNode(root.right, IS.data);// delete the inorder successor node which present in right

        }
        return root;
    }

    // left most node in right subtree
    public static Node findInOrderSuccessor(Node root) {// root is right subtree
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = build(root, values[i]);// assign to root because root se hi build kar rahe hai
        }
        inorder(root);
        System.out.println();

        root = deleteNode(root, 1);
        System.out.println();
        inorder(root);
        System.out.println();

    }
}
