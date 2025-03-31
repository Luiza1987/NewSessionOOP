package inheritence.session;

import java.util.Scanner;

public class Phone extends Technique{
    String phoneNumber;

    public Phone(String name, String brand, String version, String phoneNumber) {
        super(name, brand, version);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String turnOnOff(boolean isOn) {
        return super.turnOnOff(isOn) + ", Номер телефона: " + phoneNumber;
    }
}
