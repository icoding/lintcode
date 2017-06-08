package com.jndemo.demo;

import com.jndemo.demo.QuickSort;

/**
 * 给定一个整数数组，在该数组中，寻找三个数，分别代表三角形三条边的长度，问，可以寻找到多少组这样的三个数来组成三角形？
 *
 * 例如，给定数组 S = {3,4,6,7}，返回 3

 其中我们可以找到的三个三角形为：

 {3,4,6}
 {3,6,7}
 {4,6,7}
 给定数组 S = {4,4,4,4}, 返回 4

 其中我们可以找到的三个三角形为：

 {4(1),4(2),4(3)}
 {4(1),4(2),4(4)}
 {4(1),4(3),4(4)}
 {4(2),4(3),4(4)}
 * Created by jiangnan on 17/6/6.
 */
public class TriangleCount {
    /**
     * @param S: A list of integers
     * @return: An integer
     */
    public static int triangleCount(int S[]) {
        // write your code here
        QuickSort.quickSort(S,0,S.length-1);
        int num =0;
        for(int i=0;i<S.length;i++){
            for(int j=i+1;j<S.length;j++){
                int m1 = S[i]+S[j];
                int m2 = S[j]-S[i];
                int l = j+1;
                int r = S.length-1;
                int left = 0;
                while(l<r){
                    int mid = (r-l)/2+l;
                    if(S[mid]>m2&&S[mid-1]<=S[i]){
                        left=mid+j+1;
                        break;
                    }else if(S[mid]<m2){
                        r=mid-1;
                    }else if(S[mid]>=m2){
                        l=mid+1;
                    }
                }
                if(left==-1){
                    break;
                }
                 l = j+1;
                 r = S.length-1;
                 int right = S.length-1;
                while(l<r){
                    int mid = (r-l)/2+l;
                    if(S[mid]<m1&&S[mid+1]>=S[j]){
                        right=mid+j+1;
                        break;
                    }else if(S[mid]<m1){
                        r=mid-1;
                    }else if(S[mid]>=m1){
                        l=mid+1;
                    }
                }
                if(right==-1){
                    break;
                }
                System.out.println("l:"+left);
                System.out.println("r:"+right);
//                int n1 = binarySearch(S,m1);
//                int n2 = binarySearch(S,m2);
//                System.out.println(n1);
//                System.out.println(n2);
            }
        }
        return num;
    }
    public static int binarySearch(int a[],int m){
       int low=0;
       int high = a.length-1;
        while (low<high){
          int mid = (high-low)/2+low;
          if(a[mid]==m){
             return mid;
          }else if(a[mid]<m){
              high = mid -1;
          }else if(a[mid]>m){
              low = mid +1;
          }

        }
        return -1;
    }
    public static void IntervalLow(int a[],int m){
        if(a[0]>=m){
            System.out.println(0);
            return;
        }
        int low=0;
        int high = a.length-1;
        while(low<high){
            int mid = (high-low)/2+low;
            if(a[mid]>m&&a[mid-1]<=m){
                System.out.println(mid);
                break;
            }else if(a[mid]<=m){
                low = mid+1;
            }else if(a[mid]>m){
                high = mid-1;
            }
        }
    }
    public static void IntervalHigh(int a[],int m){
        if(a[a.length-1]<=m){
            System.out.println(a.length-1);
            return;
        }
        int low=0;
        int high = a.length-1;
        while(low<high){
            int mid = (high-low)/2+low;
            if(a[mid]<=m&&a[mid+1]>m){
                System.out.println(mid);
                break;
            }else if(a[mid]<=m){
                low = mid+1;
            }else if(a[mid]>m){
                high = mid-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,3,4,4,6,6,6,7};
//        System.out.println(triangleCount(a));
        IntervalLow(a,4);
        IntervalHigh(a,6);
    }
}
