package abstraction.session;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    private String kamera;
    private boolean isSupport5G;

    public Phone() {
    }

    public Phone(String kamera, boolean isSupport5G) {
        this.kamera = kamera;
        this.isSupport5G = isSupport5G;
    }

    public Phone(int id, String brand, int price, String operatingSystem, String colour, int yearOfIssue, String kamera, boolean isSupport5G) {
        super(id, brand, price, operatingSystem, colour, yearOfIssue);
        this.kamera = kamera;
        this.isSupport5G = isSupport5G;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public boolean isSupport5G() {
        return isSupport5G;
    }

    public void setSupport5G(boolean support5G) {
        isSupport5G = support5G;
    }

    // Phone класснын имплементациясы
    Device[] phones = new Phone[10];
    int phoneCount = 0;

    @Override
    public void addDevise(Device device) {
        phones[phoneCount++] = device;
        System.out.println("Phone added successfully!");
    }

    @Override
    public Device[] getAllDevises() {
        return phones;
    }

    @Override
    public Device getById(int id) {
        for (Device phone : phones) {
            if (phone != null && phone.getId() == id)
                return phone;
        }
        return null;
    }

    @Override
    public void updateDevice(int id, Device device) {
        Device phone = getById(id);
        if (phone != null) {
            phone.setBrand(device.getBrand());
            phone.setOperatingSystem(device.getOperatingSystem());
            phone.setPrice((int)device.getPrice());
            phone.setColour(device.getColour());
            phone.setYearOfIssue(device.getYearOfIssue().getYear());
            System.out.println("Phone updated successfully!");
        } else {
            System.out.println("Phone not found!");
        }
    }

    @Override
    public void deleteDevise(int id) {
        int index = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Device[] newPhones = new Phone[phones.length - 1];
            for (int i = 0; i < index; i++) {
                newPhones[i] = phones[i];
            }
            for (int i = index; i < newPhones.length; i++) {
                newPhones[i] = phones[i + 1];
            }
            phones = newPhones;
            System.out.println("Phone deleted successfully!");
        } else {
            System.out.println("Phone not found!");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "kamera='" + kamera + '\'' +
                ", isSupport5G=" + isSupport5G +
                "} " + super.toString();
    }
}