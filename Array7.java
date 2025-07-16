// to find the duplicate element and don't print the duplicate element in an array

import java.util.*;
public class Array7{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter a");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==0){
            System.out.println(a[i]);
        }
        }
    }
}