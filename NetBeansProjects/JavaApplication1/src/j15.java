/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class j15 {
    public static boolean nto(long n){
        if(n==1) return false;
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static long thucHien(long n){
        int i = 2;
        int dem = 0;
        long m = n;
        if(n==1) return 1;
        else if(nto(n) == true) return n;
        else{
            while(n!=1 && i<=Math.sqrt(m)){
            if(n%i==0){
                dem+=i;
                n = n / i;
            }
            else{
                i++;
            }
        }
        return dem;
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dem = 0;
        while(n-->0){
            long m = in.nextLong();
            dem += thucHien(m);
            
        }
        System.out.print(dem);
    }
}
