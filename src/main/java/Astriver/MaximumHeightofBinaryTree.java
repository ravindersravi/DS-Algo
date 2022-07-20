package Astriver;

import AHubber.binarytree.BinarySearchTree;

class TreeNodes{
    int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes(){}
    TreeNodes(int val){
        this.val=val;
    }
    TreeNodes(int val, TreeNodes left, TreeNodes right){
        this.val=val;
        this.left=left;
        this.right= right;
    }
}
public class MaximumHeightofBinaryTree {

    private static TreeNodes root;
    public static void main(String[] args) {
        insert(5);
        insert(3);
        insert(7);
        int i = maxDepth(root);
        System.out.println(i);

    }
    public static int maxDepth(TreeNodes treeNodes){
        if(treeNodes==null) return 0;
        int lh = maxDepth(treeNodes.left);
        int rh = maxDepth(treeNodes.right);
        return 1+Math.max(lh,rh);
    }
    public static void  insert(int va){
        root = insert(root, va);
    }
    public static TreeNodes insert(TreeNodes root, int value){
        if(root==null){
            root = new TreeNodes(value);
            return root;
        }
        if(value<root.val){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }
}
