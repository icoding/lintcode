package com.jndemo.demo;

import java.util.Stack;

/**
 * 在二叉树中寻找值最大的节点并返回。
 * 样例
 给出如下一棵二叉树：

 1
 /   \
 -5     2
 / \   /  \
 0   3 -4  -5
 返回值为 3 的节点。
 * Created by jiangnan on 17/6/8.
 */
public class MaxNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(10);
        TreeNode right1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(8);
        TreeNode right2 = new TreeNode(4);
        TreeNode left3 = new TreeNode(5);
        TreeNode right3 = new TreeNode(4);
        root.left = left1;
        root.right = right1;
        left1.left =left2;
        left1.right = right2;
        right2.left = left3;
        right2.right= right3;
        maxNode(root);

    }
    public static TreeNode maxNode(TreeNode root) {
        TreeNode temp = root;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(temp);
        find(root ,stack);
        return stack.pop();
    }
    public static void find(TreeNode root,Stack<TreeNode> stack){
        if(root==null){
            return;
        }
        int val = root.val;
        TreeNode temp = stack.pop();
        if(val>temp.val){
            temp = root;
        }
        stack.push(temp);
//        System.out.println(String.format("%s %s",val,temp));

        find(root.left,stack);
        find(root.right,stack);
    }
}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}