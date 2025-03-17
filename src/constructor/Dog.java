package constructor;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){

    }

    public Dog(String name, int age,String breed){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Name: " + name + "\nBreed: " + breed + "\nAge: " + age);
    }
}
