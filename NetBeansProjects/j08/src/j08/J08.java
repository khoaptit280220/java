/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J08 {

    /**
     * @param args the command line arguments
     */
    public static void xuat(int[] a, int n) {
        for(int i=0; i<n; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<n; i++){
            System.out.print("Buoc " + i + ":");
            int j;
            for(j=i-1; j>=0; j--){
                if(a[i] >= a[j]){
                    break;
                }
            }
            int temp=a[i];
            for(int t=i;t>j&&t>0;t--){
                a[t]=a[t-1];
            }
            a[j+1]=temp;
            xuat(a, i+1);
        }
    }
    
}
