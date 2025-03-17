package Constructor;

public class MyClass {
    String name;
    String lastName;
    int age;
    String[] lesson;
    String food;

    public MyClass(String name,String lastName,int age,String[] lesson, String food){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lesson = lesson;
        this.food = food;

    }
    public MyClass(String name,String lastName,int age,String[] lesson){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lesson = lesson;
        this.food = "Unknown";

    }
    public String toString() {
        String lessonString = "";
        for (String l : lesson) {
            lessonString += l + " ";
        }
        return "Name: " + name + "\nLastName: " + lastName + "\nAge: " + age +
                "\nLesson: " + lessonString + "\nFood: " + food;
    }


}
