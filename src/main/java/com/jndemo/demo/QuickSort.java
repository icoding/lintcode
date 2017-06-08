package com.jndemo.demo;

/**
 * 快速排序
 * Created by jiangnan on 17/6/6.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {5,1,32,53,1,45,5,34,6,2,63};
        quickSort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static  void quickSort(int[] a,int left,int right){
        if(left>right)
            return;
        int i,j,temp;
        i=left;
        j=right;
        temp=a[left];

        while (i!=j){
            while (a[j]>=temp&& i<j){
                j--;
            }
            while (a[i]<=temp &&i<j){
                i++;
            }
            if(i<j){
                int t = a[i];
                a[i]=a[j];
                a[j]=t;
            }

        }
        a[left]=a[i];
        a[i]=temp;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);

    }
}
