package com.jndemo.demo;

/**
 * 删除链表中等于给定值val的所有节点。
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 * Created by jiangnan on 17/6/8.
 */
public class RemoveElements {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(3);
        ListNode h5 = new ListNode(4);
        ListNode h6 = new ListNode(5);
        ListNode h7 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = h7;
        System.out.println(removeElements(h1,3));
    }
    public static ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if(head==null) return head;

        ListNode p=head,n = head.next;
        while (n!=null){
            if(n.val==val){
                p.next = n.next;
                n=n.next;
            }else {
                p = p.next;
                n = n.next;
            }
        }
        if(head.val==val){
            head = head.next;
        }

        return head;
    }
}
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}