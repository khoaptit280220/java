/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j22;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int i=0; i<t; i++){
            String s = new String();
            while(s.isEmpty() == true)
                s = in.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        //char c=s.charAt(l);
       
        while(l<=r){
            if((s.charAt(l)-'0')%2==1) return false; 
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
