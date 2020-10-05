/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06;

import java.util.*;

/**
 *
 * @author Admin
 */
public class J06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        sort(a, n);
    }
    public static void sort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Buoc " + (i + 1) + ":");
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            show(a, n);
        }
    }

    public static void show(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
