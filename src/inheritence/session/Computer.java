package inheritence.session;

public class Computer extends Technique {
    int operation;

    public Computer(String name, String brand, String version, int operation) {
        super(name, brand, version);
        this.operation = operation;
    }

    @Override
    public String turnOnOff(boolean isOn) {
        return super.turnOnOff(isOn) + ", Операция: " + operation + "GB";
    }

}
