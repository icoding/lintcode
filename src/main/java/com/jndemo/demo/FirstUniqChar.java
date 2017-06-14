package com.jndemo.demo;

/**
 * First Position Unique Character

 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 Given s = "lintcode", return 0.

 Given s = "lovelintcode", return 2.


 * Created by jiangnan on 17/6/14.
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("{{;;lintcodelintcode}}"));
    }
    public static int firstUniqChar(String s) {
        // Write your code here
        char [] chars = s.toCharArray();
        int [] a = new int [1000];
        for(char c:chars){
            a[c]++;
        }
        for(int i=0;i<chars.length;i++){
            if(a[chars[i]]==1){
                return i;
            }
        }
        return -1;
    }
}
