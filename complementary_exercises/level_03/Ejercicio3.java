package complementary_exercises.level_03;
import java.util.regex.*;
import java.util.List;

public class Ejercicio3 {
    public static void main (String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Pattern pat = Pattern.compile("^(b|B).*");
        int contador = 0;
        for (int i = 0; i < palabras.size(); i++) {
            Matcher mat = pat.matcher(palabras.get(i));
            if (mat.matches()) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
