package abstraction;

abstract class Car {
    // Поля класса
    private String model;
    private String color;
    private int maxSpeed;

    // Конструктор без параметра
    public Car() {
    }

    // Конструктор с параметрами
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // Геттеры и сеттеры для полей
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Абстрактные методы
    public abstract void gas();
    public abstract void brake();
}
