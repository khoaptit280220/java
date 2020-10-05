/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j23;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0){
            String s = new String();
            while(s.isEmpty()==true){
                s = in.nextLine();
            }
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s){
        int l=0, r= s.length()-1;
        if(s.charAt(r)!='8' || s.charAt(l)!='8') return false;
        int kq=0;
        while(l<r){
            kq += (s.charAt(l)- '0')*2;
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        if(l==r) kq += s.charAt(l)-'0';
        if(kq%10 ==0) return true;
        return false;
    }
}
