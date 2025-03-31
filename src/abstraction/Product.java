package abstraction;

public abstract class Product {
    // Поле name
    private String name;

    // Конструктор без параметра
    public Product() {
    }

    // Конструктор с параметром
    public Product(String name) {
        this.name = name;
    }

    // Getter и setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Абстрактный методы
    public abstract double getPrice();
    public abstract String getDetails();
}
