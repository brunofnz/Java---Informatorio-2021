package complementary_exercises.level_03;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String [] args){
        List<Student> studentsList = new ArrayList<Student>();
        Student e1 = new Student("Fatima", "Del Fabro", LocalDate.of(1990,1,12));
        Student e2 = new Student("Carla", "Correa", LocalDate.of(1992,3,9));
        Student e3 = new Student("Nicolas", "Mendez", LocalDate.of(1989,6,23));
        Student e4 = new Student("Tatiana", "Cabrera", LocalDate.of(1991,12,15));
        Student e5 = new Student("Lucas", "Torres", LocalDate.of(1990,8,22));

        studentsList.add(e1);
        studentsList.add(e2);
        studentsList.add(e3);
        studentsList.add(e4);
        studentsList.add(e5);

        Map<String, Integer> studentMap = studentsList.stream().collect(Collectors.toMap( s -> s.nameAndSurname(), Student::ageStudent));
        System.out.println(studentMap);
    }
}