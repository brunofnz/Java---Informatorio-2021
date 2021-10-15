package complementary_exercises.level_02;

import java.util.ArrayList;
import java.util.List;

public class exercise_02 {
    public static void main(String[] args) {
        System.out.println("Add 5 whole numbers. Then add a whole number to the beginning of the list and another to the end. Finally, iterate and print the elements of the list and the size of it (before and after adding to in the first and last position)");
        List<Integer> numbers = new ArrayList<>();
        int min = 0;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            int rand = (int) (Math.random() * (max - min + 1) + min);
            numbers.add(rand);
        }
        show(numbers);
        numbers.add(0, 28);
        numbers.add(numbers.size(), 97);
        show(numbers);
    }

    public static void show(List<Integer> numbers){
        for (Integer integer : numbers) {
            System.out.println(integer);
        }
        System.out.println("====================================");
    }

}