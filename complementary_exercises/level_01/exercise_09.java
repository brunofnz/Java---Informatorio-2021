package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        char character;
        System.out.println("Given an input string (phrase, text, etc.), calculate the number of times a given letter appears.");
        System.out.print("Enter a word or phrase: ");
        string = scanner.nextLine();
        System.out.print("Enter a character: ");
        character = scanner.next().charAt(0);
        scanner.close();
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == character)
                count++;
        }
        System.out.println(count);
    }
}
