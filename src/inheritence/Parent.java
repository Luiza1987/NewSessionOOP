package inheritence;

public class Parent {
    String name;
    int age;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class SubClass1 extends Parent {
    String hobby;
    String favoriteCourse;

    public SubClass1(String name, int age, String hobby, String favoriteCourse) {
        super(name, age);
        this.hobby = hobby;
        this.favoriteCourse = favoriteCourse;
    }

    void show() {
        super.show();
        System.out.println("Hobby: " + hobby + ", Favorite Course: " + favoriteCourse);
    }
}

class SubClass2 extends Parent {
    String profession;
    double salary;

    public SubClass2(String name, int age, String profession, double salary) {
        super(name, age);
        this.profession = profession;
        this.salary = salary;
    }

    void show() {
        super.show();
        System.out.println("Profession: " + profession + ", Salary: " + salary);

     }
}
