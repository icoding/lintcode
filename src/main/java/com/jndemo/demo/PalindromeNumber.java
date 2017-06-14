package com.jndemo.demo;

/**
 * 判断一个正整数是不是回文数。

 回文数的定义是，将这个数反转之后，得到的数仍然是同一个数。
 样例
 11, 121, 1, 12321 这些是回文数。

 23, 32, 1232 这些不是回文数。
 * Created by jiangnan on 17/6/9.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(1221));
    }
    public static boolean palindromeNumber(int num) {
        // Write your code here
        String s = num+"";
        char cs[] = s.toCharArray();
        for(int i=0;i<cs.length;i++){
            int j = cs.length-1-i;
            if(i>j){
                break;
            }
            if(cs[i]!=cs[j]){
                return false;
            }
        }
        return true;
    }


}
