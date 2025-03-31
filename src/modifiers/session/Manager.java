package modifiers.session;

public class Manager extends Employee{
    public Manager(double salary){
        super (salary);
    }
    public void increaseSalary(double amount){
        salary += amount;
    }
    public void printSalary() {
        System.out.println("Зарплата: " + salary);
    }

}
