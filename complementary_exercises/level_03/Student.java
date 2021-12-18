package complementary_exercises.level_03;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Student(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String nameAndSurname(){
        return getName() + " " + getSurname();
    }
    public int ageStudent(){
        LocalDate now = LocalDate.now();
        Period age = Period.between(getDateOfBirth(), now);
        return age.getYears();
    }
}