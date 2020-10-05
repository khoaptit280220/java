/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04mangdoixung;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J04mangdoixung {

    /**
     * @param args the command line arguments
     */
    public static void Mangdoixung(int n, int[] a){
        int l=0;
        int kt=1;
        int r=n-1;
        while(l<=r){
            if(a[l] != a[r]){
                kt=0;
                break;
            }
            else{
                l++;
                r--;
            }
        }
        if(kt==1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0){
            int n;
            int[] a = new int[100];
            n = in.nextInt();
            for(int i=0; i<n; i++){
                a[i] = in.nextInt();
            }
            Mangdoixung(n,a);
        }
    }
    
}
