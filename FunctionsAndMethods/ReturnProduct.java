import java.util.*;

public class ReturnProduct {

    public static int calculateProduct(int a, int b) {
        // int returnProduct = a * b;
        // return returnProduct;
        return a * b;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // returnProduct(a, b);

        // System.out.println(returnProduct(a, b));

        System.out.println("Product of 2 numbers is : " + calculateProduct(a, b));

    }
}
