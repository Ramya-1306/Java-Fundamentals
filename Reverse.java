import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        while(n>0){
            int digit=n%10;
            System.out.print(digit);
            n=n/10;
        }
    }
}