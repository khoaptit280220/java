/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Songuyento {

    /**
     * @param args the command line arguments
     */
    public static int sont(long n){
        
        if(n == 1) return 0;
        
            for(int i = 2; i<=n/2; i++){
                if(n % i == 0){
                   return 0;
                   
                //break;
               
                }
            }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int test;
        Scanner nhap = new Scanner(System.in);
        test = nhap.nextInt();
        while(test-->0){
            long n;
            n = nhap.nextLong();
            if(sont(n) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
