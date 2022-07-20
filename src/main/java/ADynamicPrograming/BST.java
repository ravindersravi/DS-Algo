package ADynamicPrograming;
/*
Input:
   2
 /    \
1      3
Output: 1
Explanation:
The left subtree of root node contains node
with key lesser than the root nodes key and
the right subtree of root node contains node
with key greater than the root nodes key.
Hence, the tree is a BST.
 */
// https://practice.geeksforgeeks.org/problems/check-for-bst/1/?page=1&status[]=unsolved&sortBy=submissions#

public class BST {
    public static void main(String[] args) {

    }
    Node prev = null;
    boolean isBST(Node root) {
        // code here.
        if (root == null) return true;
        if (!isBST(root.left)) return false;
        if (prev != null
                && prev.data > root.data) return false;
        prev = root;
        return isBST(root.right);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left =null;
        right = null;
    }
}
