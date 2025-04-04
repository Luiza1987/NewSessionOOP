//package enum1;
//
//public class Clientimplements cardInterface {
//    private String firstName;
//    private String lastName;
//    private int age;
//    private Card card;
//    private Basket basket;
//
//    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.card = card;
//        this.basket = basket;
//    }
//
//    @Override
//    public String payWithCard(double money) {
//        if (money > card.getBalance()) {
//            return "Сизде каражат жетишпейт.";
//        } else {
//            card.deductBalance(money);
//            String receipt = "Чек:\n";
//            for (Product product : basket.getProducts()) {
//                receipt += product.getProductName() + ": " + product.getPrice() + "\n";
//            }
//            receipt += "Жалпы сумма: " + money + "\n";
//            receipt += "Картадагы калдык: " + card.getBalance() + "\n";
//            return receipt;
//        }
//    }
//
//    @Override
//    public double getCardBalance() {
//        return card.getBalance();
//    }
//
//    public String getCardPassword() {
//        return card.getPassword();
//    }
//}