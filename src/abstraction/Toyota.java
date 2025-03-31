package abstraction;

public class Toyota extends Car{
    public Toyota() {
    }

    public Toyota(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Toyota " + getModel() + " ускоряется!");
    }

    @Override
    public void brake() {
        System.out.println("Toyota " + getModel() + " тормозит!");
    }
}
