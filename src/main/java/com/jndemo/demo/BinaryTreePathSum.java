package com.jndemo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，找出所有路径中各节点相加总和等于给定 目标值 的路径。
 * 一个有效的路径，指的是从根节点到叶节点的路径。
 *
 * 样例
 * 给定一个二叉树，和 目标值 = 5:
 *       1
 *      / \
 *      2   4
 *     / \
 *    2   3
 * 返回：
 * [
 * [1, 2, 2],
 * [1, 4]
 * ]
 * Created by jiangnan on 17/5/25.
 */
public class BinaryTreePathSum {
    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(null == root) return result;
        Stack<Integer> stack = new Stack<Integer>();
        findPath(result, stack, root, 0, target);
        return result;
    }
    public void findPath(List<List<Integer>> result, Stack<Integer> stack , TreeNode node, int sum, int target){
        sum += node.val;
        stack.push(node.val);
        if(sum==target && node.left==null && node.right==null){
            List<Integer> list = new ArrayList<Integer>(stack);
            result.add(list);
            stack.pop();
            return;
        }else{
            if(node.left!=null) findPath(result,stack,node.left,sum,target);
            if(node.right!=null) findPath(result,stack,node.right,sum,target);
            stack.pop();
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r_r = new TreeNode(2);
        TreeNode r_l = new TreeNode(4);
        TreeNode r_r_r = new TreeNode(2);
        TreeNode r_r_l = new TreeNode(3);
        root.right = r_r;
        root.left = r_l;
        r_r.left = r_r_l;
        r_r.right = r_r_r;
        BinaryTreePathSum b = new BinaryTreePathSum();
        System.out.println(b.binaryTreePathSum(root,5));

    }
    public static  class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }
}
