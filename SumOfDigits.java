import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;n>0;i++){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}