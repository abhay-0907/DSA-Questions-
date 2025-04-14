package Tree;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(2);
        BinaryTree.Node a = new BinaryTree.Node(4);
        BinaryTree.Node b = new BinaryTree.Node(10);
        BinaryTree.Node c = new BinaryTree.Node(6);
        BinaryTree.Node d = new BinaryTree.Node(5);
        BinaryTree.Node e = new BinaryTree.Node(11);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = new BinaryTree.Node(2);

        e.right = new BinaryTree.Node(33);
        e.right.left = new BinaryTree.Node(65);
        e.right.left.right = new BinaryTree.Node(76);
        System.out.print("Pre-Order Traversal: ");
        tree.preOrder(root);
        System.out.println("");
        System.out.print("In-Order Traversal: ");
        tree.inOrder(root);
        System.out.println("");
        System.out.print("Post-Order Traversal: ");
        tree.postOrder(root);
        System.out.println(" ");
        System.out.println("Height of the Binary Tree: "+ tree.heightOfBinaryTree(root));
        System.out.println("Maximum value in the Binary Tree: "+ tree.findMax(root));
        System.out.println("Size of the tree: "+ tree.sizeOfBinaryTree(root));
    }
}
