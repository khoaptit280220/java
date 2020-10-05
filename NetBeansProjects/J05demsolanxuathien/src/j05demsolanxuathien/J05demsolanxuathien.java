/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05demsolanxuathien;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J05demsolanxuathien {

    
    public static boolean kt(int n, int[] a, int k){
        for(int i = 0;i < n; i++){
            if(k == a[i]){
                return true;
            }
        }
        return false;
    }
    public static void Demsolanxuathien(int n, int[] a){
        int[] b = new int[100];
        int[] c = new int[100];
        b[0] = a[0];
        int m = 1;
        for(int i=1; i<n; i++){
            if(kt(m, b, a[i]) == false){
                b[i] = a[i];
                m++;
            }
        }
        int dem = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(b[i] == a[j]){
                    dem++;
                }
            }
            c[i] = dem;
            dem = 0;
        }
        for(int i = 0; i<m; i++){
            System.out.println(b[i] + " xuat hien " + c[i] + " lan");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int i = 1; i<=t; i++){
            int n;
            int[] a = new int[100];
            n = in.nextInt();
            for(int j=0; j<n; j++){
                a[j] = in.nextInt();
            }
           System.out.println("Test " + i + ":");
           Demsolanxuathien(n, a);
        }
    }
}
