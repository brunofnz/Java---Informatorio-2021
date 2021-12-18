package complementary_exercises.level_03;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String [] args){
        List<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add(null);
        words.add("Informatorio");
        words.add("");
        words.add(" ");

        List<String> wordFilter = words.stream().filter(word -> Objects.nonNull(word) && !word.isBlank() && !word.isEmpty())
                                .map(String::trim)
                                .collect(Collectors.toList());
        System.out.println(wordFilter);
    }
}