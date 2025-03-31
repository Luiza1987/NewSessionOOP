package inheritence.session;

public class Daughter extends Mother{
    private String hairColor;
    private int height;

    public Daughter(String name, int age, String eyeColor, String hairColor, int height) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    @Override
    public String getName() {
        return "this is daughter";
    }
}
