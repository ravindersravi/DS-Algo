package AAAtodo;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


}

public class DiameterOfBinaryTree {
    int max = 0;
    public static TreeNode rootNode;


    public static void main(String[] args) {
        DiameterOfBinaryTree d1 = new DiameterOfBinaryTree();
        d1.createBinaryTree();
        int i = d1.diameterOfBinaryTree(rootNode);
        System.out.println(i);
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
         TreeNode fifth = new TreeNode(5);

        rootNode = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right= fifth;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right + 1);
    }
}