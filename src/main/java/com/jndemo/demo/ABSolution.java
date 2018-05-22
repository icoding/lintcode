package com.jndemo.demo;

/**
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 * <a>http://www.lintcode.com/zh-cn/problem/a-b-problem/#</a>
 * @author jiangnan
 * @date 18/4/16
 */
public class ABSolution {
    /*
    * @param : An integer
    * @param : An integer
    * @return: The sum of a and b
    */
    public static int aplusb(int a, int b) {
        // write your code here
        if(b==0){
            return a;
        }
        else{
            return (aplusb(a^b,(a&b)<<1));
        }
    }

    public static void main(String[] args) {
        System.out.println(aplusb(10,2));
    }
}
