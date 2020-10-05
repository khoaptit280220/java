
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class j15khoa {

    public static int check(int n) {
        if (n == 1) {
            return 1;
        } else {
            int dem = 0;
            while (n % 2 == 0) {
                dem += 2;
                n /= 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    dem += i;
                    n = n / i;
                }
            }
            if (n > 1) {
                dem += n;
            }
            return dem;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int kq = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            kq = kq + check(m);
        }
        System.out.println(kq);
    }
}
