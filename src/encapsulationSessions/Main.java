package encapsulationSessions;

public class Main {
//    Task 1
    public static void main(String[] args) {
    House house = new House("Bishkek, St.Kopernnika 65", 3, 100); // Создание дома
    double price = 1500;
    double totalPrice = house.calculatePrice(price);
        System.out.print("Price house: " + totalPrice);
      }

}

