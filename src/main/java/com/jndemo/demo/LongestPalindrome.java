package com.jndemo.demo;

/**
 * 给出一个包含大小写字母的字符串。求出由这些字母构成的最长的回文串的长度是多少。

 数据是大小写敏感的，也就是说，"Aa" 并不会被认为是一个回文串。
 样例
 给出 s = "abccccdd" 返回 7

 一种可以构建出来的最长回文串方案是 "dccaccd"。

 思路：哈希方式 建立数组
 1.确立最长的成对出现的 字符串
 2.如果有单独字符串整体+1
 * Created by jiangnan on 17/6/9.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("zabcaa"));
    }

    /**
     *  0~9  48 - 57
     *  A - Z  65 - 90
     *  a - z 97 - 122
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        // Write your code here
        int[] a = new int[58];

        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            int temp = c[i]-'A';
            a[temp]++;
        }
        int length = 0;
        boolean flat1 = false;
        for(int i=0;i<58;i++){
            length += (a[i]/2)*2;
            if(a[i]%2==1){
                flat1=true;
            }
        }
        if(flat1)length++;
        return length;
    }
}
