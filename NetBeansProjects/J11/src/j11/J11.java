/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;

/**
 *
 * @author Admin
 */
import java.util.*;

public class J11 {

    public static int thuchien(int n) {
        int dem = 0;
        if (n % 2 == 0) {
            while (n % 2 == 0) {
                dem++;
                n = n / 2;
            }
        } else {
            return 0;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n = n / i;
                }
                dem *= count + 1;
            }
        }
        if (n > 1) {
            dem *= 2;
        }
        return dem;
    }

    public static void main(String[] argc) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            int a;
            a = in.nextInt();
            System.out.println(thuchien(a));
        }
    }
}
