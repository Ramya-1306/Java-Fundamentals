import java.util.Scanner;
public class Alpha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a value");
        char  a = sc.next().charAt(0);
        System.out.println("enter the b value");
        char b = sc.next().charAt(0);
        if(a<b){
            System.out.println(a+","+b );

        }
        else{
            System.out.println(b+","+a);
        }

    }
}