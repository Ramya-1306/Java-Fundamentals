// to print the min and max numbers in an array

import java.util.*;
public class Array2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter a");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum number is:"+max);
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("minimum number is:"+min);
    }
}