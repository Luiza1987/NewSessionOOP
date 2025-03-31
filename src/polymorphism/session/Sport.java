package polymorphism.session;

public class Sport {
    private String teamName;
    private String category;
    private int players;

    public Sport() {
    }

    public Sport(String teamName, String category, int players) {
        this.teamName = teamName;
        this.category = category;
        this.players = players;
    }

    public boolean isProfessional() {
        return category.equals("Профессиональный");
    }

    protected boolean findByTeamName(String searchName) {
        return this.teamName.equals(searchName);
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCategory() {
        return category;
    }

    public int getPlayers() {
        return players;
    }
}

