import java.util.*;

public class SolutionAge {

    public static boolean isEligible(int age) {

        if (age > 18) {
            return true;
        } else

            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(isEligible(age));

    }

}
