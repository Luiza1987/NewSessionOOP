package abstraction;

public class Lexus extends Car{
    public Lexus() {
    }

    public Lexus(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Lexus " + getModel() + " ускоряется!");
    }

    @Override
    public void brake() {
        System.out.println("Lexus " + getModel() + " тормозит!");
    }
}
