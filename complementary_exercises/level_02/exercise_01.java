package complementary_exercises.level_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> the_cities = new ArrayList<>();
        char answer = 'y';
        do {
            System.out.print("Favorite cities in Argentina");
            System.out.print("Enter an Argentine city: ");
            the_cities.add(scanner.nextLine());
            System.out.print("Continue? (Y/N): ");
            answer = scanner.nextLine().charAt(0);
        } while (answer == 'y');
        scanner.close();
        int index = 1;
        for (String city : the_cities) {
            System.out.println(String.format("#%d - %s", index++, city));
        }

    }
}