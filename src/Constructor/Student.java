package Constructor;

public class Student {

    String name;
    int age;
    int words;

    public Student(String name, int age, int words){
        this.name = name;
        this.age = age;
        if (age < 16) {
            this.words = 0;
            System.out.println(name + "Окууга мумкунчулугу жок!");
        }else {
            this.words = words;
        }

    }

}
