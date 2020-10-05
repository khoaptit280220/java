/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static long fb(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else 
        {
            long f3 = 0;
            long f1 = 1;
            long f2 = 1;
            for(int i = 3; i<=n; i++){
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            return f3;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n-->0){
            int m;
            m = in.nextInt();
            System.out.println(fb(m));
        }
    }
    
}
