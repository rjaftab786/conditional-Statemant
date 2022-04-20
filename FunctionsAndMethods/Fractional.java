import java.util.*;

public class Fractional {

    public static void printFractional(int n) {
        // loop
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {

            factorial = factorial * 1;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFractional(n);
    }
}