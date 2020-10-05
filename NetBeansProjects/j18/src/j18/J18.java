/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j18;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J18 {

    /**
     * @param args the command line arguments
     */
    public static void thucHien(int n, long k, long[] a){
        int dem = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(a[i]+a[j]==k) dem++;
            }
        }
        System.out.println(dem);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for(int i = 0; i<n; i++){
                a[i] = in.nextLong();
            }
            thucHien(n, k, a);
        }
        
    }
    
}
