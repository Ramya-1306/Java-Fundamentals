import java.util.Scanner;
public class Positive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
    }
}