package abstraction;

public class Food extends Product{
    // Поле weight
    private double weight;

    // Конструктор без параметра
    public Food() {
    }

    // Конструктор с параметром
    public Food(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    // Реализация абстрактных методов
    @Override
    public double getPrice() {
        // цена зависит от веса
        return weight * 5.0;
    }

    @Override
    public String getDetails() {
        return "Food: " + getName() + ", Weight: " + weight + "kg";
    }

    // Getter и Setter для weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
