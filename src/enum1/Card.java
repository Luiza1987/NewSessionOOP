package enum1;

public class Card {
    private String firstname;
    private String lastname;
    private String cardNumber;
    private double balance;
    private String password;

    public Card() {
    }

    public Card(String firstname, String lastname, String cardNumber, double balance, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
    }

}
