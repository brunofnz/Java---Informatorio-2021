package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Lowercase to uppercase");
        System.out.print("Enter a lowercase string: ");
        string = scanner.nextLine();
        scanner.close();
        String output = "";

        for (char c : string.toCharArray()) {
            output += (char) (((int) c) - 32);
        }

        System.out.println(output);
    }
}
