package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("Multiplication operation by successive sums");
        System.out.print("Enter number one: ");
        number1 = scanner.nextInt();
        System.out.print("Enter number two: ");
        number2 = scanner.nextInt();

        scanner.close();

        System.out.println(number1 + " * " + number2 + " = " + product(number1, number2));
    }

    public static int product(int a, int b) {
        if (a < b)
            return product(b, a);
        if (a < 0 && b < 0)
            return product(Math.abs(a), Math.abs(b));
        if (a < 0 || b < 0)
            return -product(Math.abs(a), Math.abs(b));

        if (b != 0)
            return a + product(a, b - 1);
        else
            return 0;

    }
}