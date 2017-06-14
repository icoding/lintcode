package com.jndemo.demo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jiangnan on 17/6/9.
 */
public class Test {
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
        sum(root,5);
    }
    public static void sum(TreeNode node,int sum){
        Stack<Integer> stack = new Stack<Integer>();
        List<List<Integer>> list = Lists.newArrayList();
        if(node!=null)
            find(node,sum,0,stack,list);
        System.out.println(list.toString());
    }
    public static void find(TreeNode node,int sum,int temp,Stack<Integer> stack,List<List<Integer>> list ){
        temp = node.val+temp;
        stack.push(node.val);
        if(temp==sum&&node.left==null&&node.right==null){
            List l = Lists.newArrayList();
            l.addAll(stack);
            list.add(l);
            stack.pop();
            return;
        }
        if (node.left!=null)find(node.left,sum,temp,stack,list);
        if (node.right!=null)find(node.right,sum,temp,stack,list);
        stack.pop();
    }

}
