package com.jndemo.demo;

/**
 * Created by jiangnan on 17/6/8.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    public static int fibonacci(int n) {
        // write your code here
        if(n==1){
            return 0;
        }
        if(n==2||n==3){
            return 1;
        }
        int a=1;
        int b=1;
        int c = 0;
        for(int i=4;i<=n;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(a);

        }
        return c;
    }
}
