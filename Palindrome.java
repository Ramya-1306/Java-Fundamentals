import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int num=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(num==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}