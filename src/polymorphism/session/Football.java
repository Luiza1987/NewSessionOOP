package polymorphism.session;

public class Football extends Sport {
    public Football(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void kickBall() {
        System.out.println("Бьем по футбольному мячу!");
    }
}
