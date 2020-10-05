/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05demsolanxuathien;
  import java.util.*;
/**
 *
 * @author Admin
 */
public class demxanh {
    public static void main(String[] args) {
      int test;
      Scanner in=new Scanner(System.in);
      test=in.nextInt();
      for(int t=1;t<=test;t++){
          System.out.println("Test "+t+":");
          int n=in.nextInt();
          int[] a=new int[n];
          for(int i=0;i<n;i++)
               a[i]=in.nextInt();
          check(a,n);
 
      }
    }
    public static void check(int a[],int n){
        boolean[] d=new boolean[n];
        for(int i=0;i<n;i++){
            if(d[i]==false){
             int count=1; 
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]&&d[j]==false){
                           count++;
                           d[j]=true;
                    }
                }
                System.out.println(a[i]+" xuat hien "+count+" lan");
            }     
        }
        
    }
}
