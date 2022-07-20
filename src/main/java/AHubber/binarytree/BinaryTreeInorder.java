package AHubber.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
visit left subtree
node
right sub tree
 */
public class BinaryTreeInorder {

    private TreeNode rootNode;

    static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(11);
        TreeNode second = new TreeNode(22);
        TreeNode third = new TreeNode(32);
        TreeNode fourth = new TreeNode(41);
        TreeNode fifth = new TreeNode(52);

        rootNode = first;
        first.left= second;
        first.right=third;
        second.left= fourth;
        second.right= fifth;
    }

    public static void main(String[] args) {
        BinaryTreeInorder btin= new BinaryTreeInorder();
        btin.createBinaryTree();
    //    btin.inOrder(btin.rootNode);
        System.out.println(" ");
   //     btin.inOrderIterative(btin.rootNode);
        System.out.println("");
       // btin.postOrderRecursive(btin.rootNode);
        System.out.println("" );
        btin.postOrderIterative(btin.rootNode);
        int max = btin.findMax(btin.rootNode);
        System.out.println("");
        System.out.println(max);
    }

    public int findMax(TreeNode rootNode){
        if(rootNode==null){
            return Integer.MIN_VALUE;
        }
        int result = rootNode.data;
        int left = findMax(rootNode.left);
        int right = findMax(rootNode.right);
        if(left>result)
            result = left;
        if(right>result)
            result = right;
        return result;
    }

    public void levelOrderTraversal(){
        if(rootNode ==null) return;
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.offer(rootNode);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }



    }

    public void postOrderIterative(TreeNode root){
        if(root==null) return;
        TreeNode current=root;
        Stack<TreeNode> stacks = new Stack<>();
        while (current!=null|| !stacks.isEmpty()){
            if(current!=null){
                stacks.push(current);
                current= current.left;
            }else{
                TreeNode temp = stacks.peek().right;
                if(temp==null){
                    temp= stacks.pop();
                    System.out.print(temp.data+" ");
                    while (!stacks.isEmpty() && temp==stacks.peek().right){
                        temp= stacks.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else current=temp;
            }
        }
    }

    public void postOrderRecursive(TreeNode root){
        if(root == null) return;

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }
    public void inOrder(TreeNode root){
        if(root ==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void inOrderIterative(TreeNode root){
        if(root ==null) return;
        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode temp = root;
        while(!treeNodeStack.isEmpty() || temp!=null){
            if(temp!=null){
                treeNodeStack.push(temp);
                temp=temp.left;
            }else {
                temp=treeNodeStack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }


        }
    }
}
