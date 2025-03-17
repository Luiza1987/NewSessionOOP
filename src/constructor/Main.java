package constructor;

public class Main {
    public static void main(String[] args) {
//        Class work
//
//        Cat cat1 = new Cat("Chip", 5, "Svinks");
//        Cat cat2 = new Cat("Deil", 3, "Svinks");
//
//        Dog dog1 = new Dog("Dozor", 6, "Afcharka");
//        Dog dog2 = new Dog("Kokki", 1, "Chehuahua");
//
//        cat1.getInfo();
//        cat2.getInfo();
//
//        dog1.getInfo();
//        dog2.getInfo();

//        Class work

//        Student student1 = new Student("Arman ", 20, 200);
//        Student student2 = new Student("Luiza ", 38, 150);
//        Student student3 = new Student("Aila ", 15, 300);
//        Student student4 = new Student("Sanjar ", 18, 250);
//        Student student5 = new Student("Elnura ", 20, 350);
//
//        Student[] students = {student1, student2, student3, student4, student5};
//
//        Course course = new Course("Java-17", "Muhammed", students);
//        System.out.println("Course: " + course.cuorseName);
//        System.out.println("Instructor: " + course.instructor);
//        for (Student student : students) {
//            System.out.println(student.name + " - жашы: " + student.age + " words: " + student.words);

//        Class Work
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Family 1 Info:");
//        System.out.print("Enter the father's name: ");
//        String father1 = scanner.nextLine();
//        System.out.print("Enter the mother's name: ");
//        String mother1 = scanner.nextLine();
//        System.out.print("Enter the ChildrenCount: ");
//        int children1 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Enter the animal: ");
//        String animal1 = scanner.nextLine();
//        Family family1 = new Family(father1, mother1, children1, animal1);
//
//        System.out.println("\nEnter Family 2 Info:");
//        System.out.print("Enter the mother's name: ");
//        String mother2 = scanner.nextLine();
//        System.out.print("Enter the ChildrenCount: ");
//        int children2 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Enter the animal: ");
//        String animal2 = scanner.nextLine();
//        Family family2 = new Family(mother2, children2, animal2);
//
//        System.out.println("\nEnter Family 3 Info:");
//        System.out.print("Enter the father's name: ");
//        String father3 = scanner.nextLine();
//        System.out.print("Enter the mother's name: ");
//        String mother3 = scanner.nextLine();
//        System.out.print("Enter the ChildrenCount: ");
//        int children3 = scanner.nextInt();
//        scanner.nextLine();
//        Family family3 = new Family(father3, mother3, children3);
//
//        System.out.println("\nEnter Family 4 Info:");
//        System.out.print("Enter the father's name: ");
//        String father4 = scanner.nextLine();
//        System.out.print("Enter the mother's name: ");
//        String mother4 = scanner.nextLine();
//        System.out.print("Enter the animal: ");
//        String animal4 = scanner.nextLine();
//        Family family4 = new Family(father4, mother4, animal4);
//
//        System.out.println("\nFamily 1 Info:\n" + family1);
//        System.out.println("Family 2 Info:\n" + family2);
//        System.out.println("Family 3 Info:\n" + family3);
//        System.out.println("Family 4 Info:\n" + family4);

//        Home work

        MyClass myClass1 = new MyClass("Elnura", "Arapova", 20,
                new String[]{"java,","JS"},"Plov, Manty");
        MyClass myClass2 = new MyClass("Luiza", "Zakirova", 38,
                new String[]{"java,", "C#"});

        System.out.println(myClass1);
        System.out.println(myClass2);

    }
}


