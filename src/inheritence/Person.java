package inheritence;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void learn() {
        System.out.println(name + " is learning.");
    }
    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation;
    }

}
class Programmer extends Person {
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(name + " is coding at " + companyName);
    }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + companyName;
    }
}

class Dancer extends Person {
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(name + " is dancing in group " + groupName);
    }

    @Override
    public String toString() {
        return super.toString() + ", Group: " + groupName;
    }
}

class Singer extends Person {
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(name + " is singing in band " + bandName);
    }

    public void playGitar() {
        System.out.println(name + " is playing guitar in band " + bandName);
    }

    @Override
    public String toString() {
        return super.toString() + ", Band: " + bandName;
    }
}