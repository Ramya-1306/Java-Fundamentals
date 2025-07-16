import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter a");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max1 = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max1) {
                max1 = a[i];
            }
        }
        int max2 = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max2 && a[i] < max1) {
                max2 = a[i];
            }
        }
        int min1 = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min1) {
                min1 = a[i];
            }
        }
        int min2 = a[0] == min1 ? a[1] : a[0];  
        for (int i = 0; i < n; i++) {
            if (a[i] > min1 && a[i] < min2) {
                min2 = a[i];
    }
}
        System.out.println("1st maximum number is: " + max1);
        System.out.println("2nd maximum number is: " + max2);
        System.out.println("1st minimum number is: " + min1);
        System.out.println("2nd minimum number is: " + min2);
    }
}
