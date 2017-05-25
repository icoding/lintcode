package com.jndemo.demo;

/**
 * Created by jiangnan on 15-4-8.
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(gongyue(12, 14));
        System.out.println(gongbei(12,14));

    }

    /**
     * 最小公倍数
     * @param p
     * @param q
     * @return
     */
    public static int gongbei(int p,int q){
        int r = p*q/gongyue(p,q);
        return r;
    }
    /**
     * 最大公约数
     * @param p
     * @param q
     * @return
     */
    public static int gongyue(int p,int q){
        if(q==0)
            return p;
        int r = p%q;
//        System.out.println(r);
        return gongyue(q,r);
    }
}
