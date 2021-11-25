package complementary_exercises.level_03;
import java.time.*;
import java.util.List;

/*

Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)

Input (Entrada)
List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.));

Output (Salida):
{"Simpson Homero"=30}

*/

public class Ejercicio5 {

     public static class Alumno {
        private String nombre, apellido;
        private LocalDate fechaDeNacimiento;

        public Alumno (String nombre, String apellido, LocalDate fechaDeNacimiento){
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        public String getFields(){
            return nombre + "\n" + apellido + "\n" + fechaDeNacimiento;
        }
    } 
    
    public static void main(String[] args)
        {
            List<Alumno> alumnos = List.of( 
                new Alumno("Homero", "Simpson", LocalDate.parse("24")),
                new Alumno("Marge", "Simpson", LocalDate.parse("2021-11-24")),
                new Alumno("Bart", "Simpson", LocalDate.parse("2021-11-24")),
                new Alumno("Lisa", "Simpson", LocalDate.parse("2021-11-24")),
                new Alumno("Maggie", "Simpson", LocalDate.parse("2021-11-24"))
            );
    
            // print result

            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println(alumnos.get(i).getFields());
            }
            
        }
    }
