package complementary_exercises.level_01;

import java.util.Scanner;

public class exercise_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, city, address;
        Integer age;
        System.out.println("Data of a person");
        System.out.print("Enter your name and surname: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter your city: ");
        city = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        scanner.close();

        System.out.println(String.format("{%s} - {%s} - {%d} - {%s}", city, address, age, name));
    }
}