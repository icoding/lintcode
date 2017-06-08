package com.jndemo.demo;

/**
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 * 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 * Created by jiangnan on 17/6/8.
 */
public class SortIntegers {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 4, 5};
        sortIntegers(A);
    }
    public static void sortIntegers(int[] A) {
        // Write your code here
        bubbleSort(A);

    }
    public static void bubbleSort(int[] A){
        for(int b:A){
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println();
        boolean flag = true;
        for(int i=1;i<A.length && flag;i++){
            flag = false;
            for(int j=0;j<A.length-i;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    flag=true;//发生了数据交换

                }
                for(int b:A){
                    System.out.print(b);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        for(int i:A){
            System.out.println(i);
        }
    }
}
