package inheritence.session;

public class Mother {
    private String name;
    private int age;
    private String eyeColor;

    public Mother(String name, int age, String eyeColor){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;

    }
    public String getName() {
        return name + " this is mother";
    }
    }