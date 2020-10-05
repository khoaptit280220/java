/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j09;

import java.util.*;

/**
 *
 * @author Admin
 */
public class j09 {

    /**
     * @param args the command line arguments
     */
    public static boolean kt(int n, int a[]) {
        int ktra = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                ktra = 0;
                break;
            }
        }
        if (ktra == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void xuat(int n, int a[]) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //MySwap sw = new MySwap();
        int n;
        int b = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[j - 1] > a[j]) {
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
            System.out.print("Buoc " + b + ": ");
            b++;
            xuat(n, a);
            System.out.println();
            if (kt(n, a) == true) {
                break;
            }
        }
    }

}
