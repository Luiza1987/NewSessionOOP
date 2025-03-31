package polymorphism.session;

public class Basketball extends Sport {
    public Basketball(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void throwBall() {
        System.out.println("Бросаем баскетбольный мяч!");
    }
}
