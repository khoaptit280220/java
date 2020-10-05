/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07sapxepchon;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J07sapxepchon {

    /**
     * @param args the command line arguments
     */
    public static void xuat(int n, int a[]){
        for(int i = 0; i<n-1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n-1]);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //MySwap sw = new MySwap();
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            int min = i;
            int k = i;
            for(int j = i+1; j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.print("Buoc " + (i+1) + ": ");
            xuat(n, a);
            System.out.println();
        }
    }
    
}
