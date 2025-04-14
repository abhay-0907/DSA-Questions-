package Tree;


public class BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public void preOrder(Node node){
        if(node==null) return;

        System.out.print(node.val+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public  void postOrder(Node node){
        if(node==null) return;

        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.val+ " ");

    }
    public  void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.val+ " ");
        inOrder(node.right);
    }

    public int sizeOfBinaryTree(Node node){
        if(node==null) return 0;
        return 1 + sizeOfBinaryTree(node.left) + sizeOfBinaryTree(node.right);
    }

    public double findMax(Node root){
        if(root==null) return Integer.MIN_VALUE;
        double leftMax = findMax(root.left);
        double rightMax = findMax(root.right);
        return Math.max(root.val,Math.max(leftMax,rightMax));
    }

    public int heightOfBinaryTree(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1 + heightOfBinaryTree(root.left) + heightOfBinaryTree(root.right);
    }
}
