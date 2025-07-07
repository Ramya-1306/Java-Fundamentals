import java.util.Scanner;
public class Percentage {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int a = sc.nextInt();
         System.out.println("enter the gender");
         String b= sc.nextLine();
         String g =sc.nextLine();
        if((g.equals("female"))&&(1<=a && 58>=a )){
            System.out.println("the percentage of interest is 8.2");
        }
        else if((g.equals("female"))&&(59<=a && 100>=a )){
            System.out.println("the percentage of interest is 9.2");
        }
        else if(g.equals("male")&&(1<=a && 58>=a )){
             System.out.println("the percentage of interest is 8.4");
        }
        else if(g.equals("male")&&(59<=a && 100>=a )){
            System.out.println("the percentage of interest is 7.7");
        }
        }
}