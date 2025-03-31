package abstraction.session;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Device {
    private String processor;
    private String RAM;

    Device[] laptops = new Laptop[10];
    int laptopCount = 0;

    public Laptop() {
    }

    public Laptop(String processor, String RAM) {
        this.processor = processor;
        this.RAM = RAM;
    }

    public Laptop(int id, String brand, int price, String operatingSystem, String colour, int yearOfIssue, String processor, String RAM) {
        super(id, brand, price, operatingSystem, colour, yearOfIssue);
        this.processor = processor;
        this.RAM = RAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void addDevise(Device device) {
        laptops[laptopCount++] = device;
        System.out.println("Success!");
    }

    @Override
    public Device[] getAllDevises() {
        return laptops;
    }

    @Override
    public Device getById(int id) {
        for (Device laptop : laptops) {
            if (laptop != null && laptop.getId() == id)
                return laptop;
        }
        return null;
    }

    @Override
    public void updateDevice(int id, Device device) {
        Device laptop = getById(id);
        if (laptop != null) {
            laptop.setBrand(device.getBrand());
            laptop.setOperatingSystem(device.getOperatingSystem());
            laptop.setPrice((int)device.getPrice());
            laptop.setColour(device.getColour());
            laptop.setYearOfIssue(device.getYearOfIssue().getYear());
            System.out.println("Success");
        } else {
            System.out.println("Device not found!");
        }
    }

    @Override
    public void deleteDevise(int id) {
        int index = -1;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i] != null && laptops[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Device[] newDevice = new Laptop[laptops.length - 1];
            // tabylgan index ke cheiinkilerdi jany masssivke kochurup aldyk
            for (int i = 0; i < index; i++) {
                newDevice[i] = laptops[i];
            }
            // tabylgan index ten kiinkilerdi jany masssivke kochurup aldyk
            for (int i = index; i < newDevice.length; i++) {
                newDevice[i] = laptops[i + 1];
            }
            laptops = newDevice;
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", RAM='" + RAM + '\'' +
                "} " + super.toString();
    }
}