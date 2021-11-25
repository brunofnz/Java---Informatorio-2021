package complementary_exercises.level_03;
import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.

Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);

(Salida):
[1, 2, 24]

*/

public class Ejercicio4 {

    // factorial
    static int factorial(int num){
        int factorial=1;
        while( num != 0){
            factorial *= num;
            num --;
        }
        return factorial;
    }

    // filtro

    static void filtro(List<Integer> palabras){
        
        Set<Integer> items = new HashSet<>();
        palabras.stream()
                .filter(n -> !items.add(factorial(n)))
                .collect(Collectors.toSet());
        System.out.println(items);
            }

    public static void main(String[] args){
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        filtro(palabras);
    }

}