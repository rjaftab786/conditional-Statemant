import java.util.*;

public class ExeHollowPatt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        // outer loops

        // no of rows =n
        // no of column = m

        for (int i = 1; i <= n; i++) {

            // inner loops

            for (int j = 1; j <= m; j++) {

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
