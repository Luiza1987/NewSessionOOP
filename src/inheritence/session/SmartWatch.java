package inheritence.session;

public class SmartWatch extends Technique {
    boolean Monitor;

    public SmartWatch(String name, String brand, String version, boolean Monitor) {
        super(name, brand, version);
        this.Monitor = Monitor;
    }

    @Override
    public String turnOnOff(boolean isOn) {
        return super.turnOnOff(isOn) + ", Монитор пульса: " + (Monitor ? "Есть" : "Нет");
    }
}
