/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j24;
import java.util.*;
/**
 *
 * @author Admin
 */
public class J24 {

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
            while(s.isEmpty() == true){
                s = in.nextLine();
            }
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s){
        int l=0,r= s.length()-1;
        while(l<=r){
            if(s.charAt(l)!='2' &&s.charAt(l)!='3' && s.charAt(l)!='5'&& s.charAt(l)!='7') return false;
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
