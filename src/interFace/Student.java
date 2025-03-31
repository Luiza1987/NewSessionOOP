package interFace;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Study{
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student() {
    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + " окуу жайы: " + educationCenter.name);
    }

    @Override
    public void getStudentsStudyingYear() {
        int years = Period.between(dateOfStart, LocalDate.now()).getYears();
        System.out.println(name + " " + surname + " окуганына " + years + " жыл болду.");
    }

}
