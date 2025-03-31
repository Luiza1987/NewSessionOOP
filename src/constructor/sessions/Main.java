package constructor.sessions;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Task1,2

//        Student student1 = new Student("Elnura", LocalDate.of(2004,05, 23),
//                "0996552345678", "Kyrgyz");
//
//        Student student2 = new Student("Luiza", LocalDate.of(1987,03, 22),
//                "0996551220001", "Kyrgyz");
//
//        Student student3 = new Student("Baitenir", LocalDate.of(2006,06, 12),
//                "09965512345678", "Kyrgyz");
//
//        Student student4 = new Student("Nurpazyl", LocalDate.of(2006,06, 12),
//                "09967722345678", "Kyrgyz");
//
//        Student student5 = new Student("Sanjar", LocalDate.of(2006,06, 12),
//                "09967732345678", "Kyrgyz");
//
//        Student [] students = { student1,student2,student3,student4,student5};
//
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        Task 3

//        Person person1 = new Person("Elnura", "Arapova", "15.05.2005");
//        Person person2 = new Person("Luiza", "Zakirova", "22.03.1987");
//
//        Person[] group1Members = {person1, person2};
//        Group group1 = new Group("Java-17", "03.03.2025", "Aizat Talaibekovna", group1Members);
//
//        Group[] companyGroups = {group1};
//        Company company = new Company("Peaksoft House", "Kyrgyzstan",
//                2020, "Esen Niyazov", companyGroups);
//
//        System.out.println("Company: " + company.companyName);
//        System.out.println("Country: " + company.country);
//        System.out.println("Year of foundation: " + company.yearOfFoundation);
//        System.out.println("Founder: " + company.founder);
//        System.out.println("Groups:");
//        for (Group group : company.groups) {
//            System.out.println(group.groupName);
//            System.out.println("Start date: " + group.startDate);
//            System.out.println("Mentor: " + group.mentor);
//            System.out.println("People:");
//            for (Person person : group.people) {
//                System.out.println(person.firstName + " " + person.lastName + ": " + person.dateOfBirth);


//        Task4

//        Person[] person = {
//                new Person("Elnura", 20, "Programmist", 250000, 90000),
//                new Person("Luiza", 38, "Buhgalter", 30000, 20000),
//                new Person("Baitenir", 18, "Direktor", 350000, 120000),
//                new Person("Nurpazyl", 18, "Instructor", 400000, 110000),
//                new Person("Sanjar", 18, "Analitik", 150000, 35000),
//        };
//        for (Person person1 : person){
//            System.out.println(person1);
//        }
//        Person maxSalary = person[0];
//        Person minSalary = person[0];
//        Person maxPhone = person[0];
//
//        for (Person person1 : person) {
//            if (person1.salary > maxSalary.salary) maxSalary = person1;
//            if (person1.salary < minSalary.salary) minSalary = person1;
//            if (person1.phone > maxPhone.phone) maxPhone = person1;
//        }
//
//        System.out.println("\nЧеловек с самой высокой зарплатой: " + maxSalary);
//        System.out.println("Человек с самой низкой зарплатой: " + minSalary);
//        System.out.println("Человек с самым дорогим телефоном: " + maxPhone);

//        Homework

        Book book1 = new Book(1, "Бегущий за ветром", 1300, "Драма",
                LocalDate.of(2003, 5, 29));
        Book book2 = new Book(2, "Тысяча сияющих солнц", 1000, "Драма",
                LocalDate.of(2007, 5, 22));
        Book book3 = new Book(3, "И эхо летит по горам", 1500, "Драма",
                LocalDate.of(2013, 5, 21));
        Book book4 = new Book(4, "Шантарам", 3000.0, "Роман",
                LocalDate.of(2003, 9, 1));
        Book book5 = new Book(5, "Тень горы", 5000.0, "Роман",
                LocalDate.of(2015, 10, 1));

        Book[] books1 = {book1, book2};
        Book[] books2 = {book3, book4};
        Book[] books3 = {book5};

        Library library1 = new Library(1, ":\nНациональная библиотека", "208 Abdrahmanova St", books1);
        Library library2 = new Library(2, ":\nРеспубликанская библиотека", "242 Ataya Ogonbaeva St", books2);
        Library library3 = new Library(3, ":\nPro Books библиотека", "79 Isanova St", books3);

        library1.getBooks();
        library2.getBooks();
        library3.getBooks();
    }
}
