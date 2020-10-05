/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j13;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J13 {

    /**
     * @param args the command line arguments
     */
    public static int ktra(int n, int m){
        for(int i = 1; i<=n; i++){
            if(m%i!=0){
                return 0;
            }
        }
        return 1;
    }
    public static int thucHien(int n){
        int m = n/2;
        //int i = 1;
        int kq = 0;
        while(true){
          if(ktra(n,m)==1){
              kq = m;
              break;
          }
          else m++;
        }
        return kq;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            
            System.out.println(thucHien(n));
        }
    }
    
}
