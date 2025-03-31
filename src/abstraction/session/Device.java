package abstraction.session;

import java.time.LocalDate;

abstract class Device {
    private int id;
    private String brand;
    private long price;
    private String operatingSystem;
    private String colour;
    private LocalDate yearOfIssue;

    public Device() {
    }

    public Device(int id, String brand, int price, String operatingSystem, String colour, int yearOfIssue) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
        this.yearOfIssue = LocalDate.of(yearOfIssue, 1, 1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = LocalDate.of(yearOfIssue, 1, 1);
    }

    public abstract void addDevise(Device device);
    public abstract Device[] getAllDevises();
    public abstract Device getById(int id);
    public abstract void updateDevice(int id, Device device);
    public abstract void deleteDevise(int id);

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", colour='" + colour + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}