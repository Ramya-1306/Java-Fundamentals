import java.util.*;
public class ColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color code character (R, G, B): ");
        char s = sc.next().charAt(0);
        switch (s) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
                case 'B':
            case 'b':
                System.out.println("Blue");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            case 'o':
            case 'O':
            System.out.println("Orange");
            break;
            case 'y':
            case 'Y':
            System.out.println("yellow");
            break;
            case 'w':
            case 'W':
            System.out.println("white");
            break;
            default:
                System.out.println("Invalid color code");
        }
    }
}
