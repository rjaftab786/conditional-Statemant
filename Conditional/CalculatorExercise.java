import java.util.*;

public class CalculatorExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:  ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter an operator (+, -, *, /,):  ");
        char operator = sc.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            case '%':
                result = a % b;
                break;

            default:
                System.out.println("Error! Invalid Result");
                return;

        }
        System.out.println(a + " " + operator + " " + b + " = 6" + result);

    }

}
