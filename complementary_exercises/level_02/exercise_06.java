package complementary_exercises.level_02;

/** Se dispone de una lista de Empleados, de cada empleado se conoce:
 * - Nombre y Apellido
 * - DNI
 * - horasTrabajadas
 * - valorPorHora
 * 
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular 
 * el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego 
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el 
 * valor (value) es el sueldo calculado.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class exercise_06 {
    public static void main(String[] args) {
        Set<a_employe> employees = new HashSet<>();
        load(employees);

        Map<Integer, Float> Employees = new HashMap<>();
        for (a_employe employee : employees) {
            Employees.put(employee.getDni(), employee.getSalary());
        }
        System.out.println(Employees);
    }

    public static void load(Set<a_employe> employees){
        a_employe emp1 = new a_employe(1561, "Bruno Fernandez", 8, 78.78f);
        a_employe emp2 = new a_employe(9874, "Mario Bros", 12, 78.15f);
        a_employe emp3 = new a_employe(8746, "Augusto White", 4, 77.95f);
        a_employe emp4 = new a_employe(1345, "Ramon Valdes", 9, 68.45f);
        
        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
    }

}

