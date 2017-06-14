package com.jndemo.demo;

/**
 * Created by jiangnan on 17/6/9.
 */
public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("a`%ii,VEZQc_BSU%ObO5<sX81B/bOw+CNUd#Uav*P!Ax!#>hh,k#b/|>4ixFQZl+l!?bJjakbQbGglEb<g>Hf81m@A9GIvbd]qh?y__t+E(Iyv7zUEfZF{81VaM-0u?]tG=_fFR/XJ=X{-,oRpxE9u*VNYlM","b`%ii-WE[Qc_BSV%OcO5<sX82B/cOw+CNVd#Vbv*P!Bx!#?hh-k#c/|?4ixFQ[l+l!?cJkbkcQcGhlEc<h?Hf82m@B9GIvcd]rh?y__t+E(Iyv7{VEf[F{82WbN/0u?]tG=_fFR/XJ=X{/-oRpxE9u*WNYlN"));
    }
    public static boolean isIsomorphic(String s, String t) {
        // Write your code here
        if(s==null||t==null){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t))
            return true;
        int[] a  = newString(s);
        int[] b  = newString(t);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }

        return true;
    }
    public static int[] newString(String s){
        int [] a = new int[256];
        char[] cs = s.toCharArray();
        for(char x:cs){
            int c = s.indexOf(x+"");
            if(a[c]==0){
                a[c]++;
            }

        }
//        for(int i:a){
//            System.out.print(i+" ");
//        }
//        System.out.println();
        return a;
    }
}
