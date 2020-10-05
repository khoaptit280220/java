/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j10ucln;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J10UCLN {

    /**
     * @param args the command line arguments
     */
    public static long ucln(long a, long b){
        if(a==b) return a;
        else if(a > b) return ucln(a-b, b);
        else return ucln(a, b-a);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0){
            long a,b;
            a = in.nextLong();
            b = in.nextLong();
            long p = a*b;
            long uc = ucln(a,b);
            long bc = p/uc;
            System.out.println(bc + " " + uc);
        }
    }
    
}
