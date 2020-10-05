/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phantichso;
import java.util.*;

/**
 *
 * @author Admin
 */
public class PhanTichSO {

    /**
     * @param args the command line arguments
     */
    
    public static void phanTichSo(int n){
        int dem = 0;
        int i = 2;
        int test = 1;
        int m = n;
        //Vector<int> v1 = new Vector<>();
        while(n!=0 && i <= Math.sqrt(m)){
            if(n % i == 0){
                dem++;
                n = n /i;
            }
            else{
                if(dem != 0){
                    System.out.print( " " + i + "(" + dem + ")");
                    dem = 0;
                    i++;
                }
                else i++;
                
            }
        }
        if(n > 1) System.out.printf(" %d(1)", n);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int test;
        Scanner in = new Scanner(System.in);
        test = in.nextInt();
        for(int i = 1; i<=test; i++){
            int n;
            n = in.nextInt();
            System.out.print("Test " + i + ":");
            phanTichSo(n);
            System.out.println();
        }
        
    }
    
}
