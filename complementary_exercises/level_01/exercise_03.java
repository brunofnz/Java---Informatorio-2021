package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String output = "";
        System.out.println("Number sequence of a number.");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) {
            output += String.valueOf(i) + " ";
            System.out.println(output);
        }
    }
}
