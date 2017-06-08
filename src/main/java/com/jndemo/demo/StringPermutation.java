package com.jndemo.demo;

/**
 * 给定两个字符串，请设计一个方法来判定其中一个字符串是否为另一个字符串的置换。

 置换的意思是，通过改变顺序可以使得两个字符串相等。
 * Created by jiangnan on 17/6/8.
 */
public class StringPermutation {
    public static void main(String[] args) {
        int i=0;
        i++;
        System.out.println(i);
        System.out.println('a'-' ');
        System.out.println(stringPermutation("abc","cac"));
    }
    /**
     * @param A a string
     * @param B a string
     * @return a boolean
     */
    public static boolean stringPermutation(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        // Write your code here
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int[] t = new int[100];

        for(int i=0;i<a.length;i++){
            int m = a[i]-' ';
            t[m]++;
            int n = b[i]-' ';
            t[n]--;
        }
//        for(char aa:a){
//            int i = aa-' ';
//           t[i]++;
//        }
//        for(char aa:b){
//            int i = aa-' ';
//            t[i]--;
//        }
        for(int i=0;i<100;i++){
            if(t[i]!=0){
                return false;
            }
        }
        return true;
    }
}
