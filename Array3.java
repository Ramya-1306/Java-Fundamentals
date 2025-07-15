// to find the sum of the array and the average of the array


import java.util.*;
public class Array3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter a");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter any number");
        int user=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(user==a[i]){
                found=true;
                System.out.println("The given input is:"+""+ a[i]+"and the index of the input is:"+i);
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}