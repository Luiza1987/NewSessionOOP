package inheritence.session;

public class Technique {
    String name;
    String brand;
    String version;

    public Technique(String name, String brand, String version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String turnOnOff(boolean isOn) {
        return name + " " + (isOn ? "Включена" : "Выключена");
    }
}
