package interFace;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Class work
//        SwimAble[] oceanarium = {
//                new Shark(), new Shark(), new Shark(), new Shark(), new Shark(),
//                new Duck(), new Duck(), new Duck(), new Duck(), new Duck(),
//                new Turtle(), new Turtle(), new Turtle(), new Turtle(), new Turtle()
//        };
//
//        // Делаем всех животных плавать
//        for (SwimAble animal : oceanarium) {
//            animal.swim();
//        }
//        Class work

//        Backed bread = new Bread();
//        Backed pie = new Pie();
//        Backed bun = new Bun();
//
//        bread.bake();
//        bread.ingredients();
//
//        pie.bake();
//        pie.ingredients();
//
//        bun.bake();
//        bun.ingredients();
//
//       Home work


        EducationCenter school = new School("N61 School", "Kyrgyzstan",
                LocalDate.of(1963, 9, 1));
        EducationCenter university = new University("KGMA", "Kyrgyzstan",
                LocalDate.of(1939, 4, 16));
        EducationCenter college = new College("Kyrgyz Aviation College", "Kyrgyzstan",
                LocalDate.of(1993, 9, 1));

        Student[] students = {
                new Student("Ilyas", "Zakirov", "MAN",
                        LocalDate.of(2020, 9, 1), school),
                new Student("Zalina", "Zakirova", "WOMAN",
                        LocalDate.of(2019, 9, 1), university),
                new Student("Ainazik", "Shamshieva", "WOMAN",
                        LocalDate.of(2021, 9, 1), college),
                new Student("Eliza", "Toktosunova", "WOMAN",
                        LocalDate.of(2018, 9, 1), university),
                new Student("Eldiyar", "Bekbolotov", "MAN",
                        LocalDate.of(2022, 9, 1), school),
                new Student("Elgiza", "Turusbekova", "WOMAN",
                        LocalDate.of(2017, 9, 1), university),
                new Student("Azamat", "Kojoev", "MAN",
                        LocalDate.of(2016, 9, 1), college),
                new Student("Nurzat", "Abdiev", "MAN",
                        LocalDate.of(2023, 9, 1), school),
                new Student("Meerim", "Sadykova", "WOMAN",
                        LocalDate.of(2022, 9, 1), college),
                new Student("Bekzat", "Ishenkulov", "MAN",
                        LocalDate.of(2020, 9, 1), university)
        };

        printStudentsInfo(students);
    }

    public static void printStudentsInfo(Student[] students) {
        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println("---------------------------");
        }
    }
}