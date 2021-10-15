package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Power operation");
        System.out.print("Enter number one: ");
        num1 = scanner.nextInt();
        System.out.print("Enter number two: ");
        num2 = scanner.nextInt();

        scanner.close();

        System.out.println(num1 + " ^ " + num2 + " = " + pow(num1, num2));
    }

    public static float pow(int base, int exp) {
        if (exp == 0)
            return 1;
        else if (exp < 0)
            return 1 / pow(base, Math.abs(exp));
        else
            return base * pow(base, exp - 1);
    }
}
