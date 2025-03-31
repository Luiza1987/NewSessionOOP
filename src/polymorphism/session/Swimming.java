package polymorphism.session;

public class Swimming extends Sport {
    public Swimming(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void swim() {
        System.out.println("Плывем в бассейне!");
    }
}
