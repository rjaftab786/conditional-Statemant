import java.util.*;

public class SolutionRadius {

    public static Double getCircumference(double radius)

    {
        return 2 * 3.14 * radius;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double r = sc.nextDouble();

        System.out.println(getCircumference(r));

    }

}