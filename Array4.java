// to find the sum of the array and the average of the array


import java.util.*;
public class Array4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter a");
        char c=' ';
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>=65&&a[i]<=90){
            c=(char)a[i];
            System.out.print(c);
            }
            else{
                System.out.println("enter correct number");
            }
        }
            }
}