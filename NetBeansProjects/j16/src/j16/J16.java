/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j16;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J16 {

    /**
     * @param args the command line arguments
     */
    public static void thucHien(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            boolean kt = true;
            for (int j = i + 1; j < n; j++) {
                if (a[i] <= a[j]) {
                    kt = false;
                }
            }
            if (kt == true) {
                System.out.print(a[i] + " ");
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n;
            n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            thucHien(n, a);
        }

    }

}
