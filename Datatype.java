import java.util.Scanner;
public class Datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char asci = input.charAt(0);
        if ((asci >= 'A' && asci <= 'Z') || (asci >= 'a' && asci <= 'z')) {
            System.out.println("alphabet");
        } else if (asci >= '0' && asci <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("special character");
        }
    }
}