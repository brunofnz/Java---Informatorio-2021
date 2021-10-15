package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Calculate the factorial of a number");
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();

        System.out.println("factorial of " + num + " is: " + factorial(num));
    }

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        } else if (num == 0) {
            return 1;
        } else {
            return num *= factorial(num - 1);
        }
    }
}
