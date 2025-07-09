import java.util.*;
public class Array1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter a");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println("sum:"+sum);
        float avg=sum/2f;
        System.out.printf("avg:%.1f",avg);
    }
}