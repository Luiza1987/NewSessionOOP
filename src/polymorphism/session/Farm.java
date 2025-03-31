package polymorphism.session;

public class Farm {
    private String address;
    private Sheep[] sheeps;
    private Cow[] cows;
    private Horse[] horses;
    private String ownerName;

    public Farm(String address, Sheep[] sheeps, Horse[] horses, Cow[] cows, String ownerName) {
        this.address = address;
        this.sheeps = sheeps;
        this.horses = horses;
        this.cows = cows;
        this.ownerName = ownerName;
    }
}
