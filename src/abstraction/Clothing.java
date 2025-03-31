package abstraction;

public class Clothing extends Product{
    // Поле size
    private String size;

    // Конструктор без параметра
    public Clothing() {
    }

    // Конструктор с параметром
    public Clothing(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return 500.0;
    }

    @Override
    public String getDetails() {
        return "Clothing: " + getName() + ", Size: " + size;
    }
    // Getter и Setter для size
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
