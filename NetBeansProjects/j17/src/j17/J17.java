/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j17;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J17 {

    /**
     * @param n
     * @param a
     */
     public static void thucHien(int n, int[] a){
        int dem =0;
        int dem2 =0;
        for(int i=1; i<n; i++){
            dem2 += a[i];
        }
        int kt = 0;
        for(int i=0; i<n; i++){
            if(dem == dem2) {
                kt = 1;
                System.out.println(i+1);
                break;
            }
            dem += a[i];
            dem2 -= a[i+1];
            
        }
        
        if(kt == 0) System.out.println(-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n+1];
            for(int i=0; i<n; i++){
                a[i]=in.nextInt();
            }
            thucHien(n,a);
            System.out.println();
        }
         
    }
   
}
