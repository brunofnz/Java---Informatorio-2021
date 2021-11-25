package complementary_exercises.level_03;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		palabras.add(null);
		palabras.add("Informatorio");
		palabras.add("");

		for (int i = 0; i < palabras.size(); i++) {
			if (palabras.get(i) == null || palabras.get(i) == "") {
				palabras.remove(i);
				i = i - 1;
			}
		}

		System.out.println(palabras);		
	}
}
