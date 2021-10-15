package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello! What's your name? :) ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("My name's " + name);
    }
}