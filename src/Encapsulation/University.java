package Encapsulation;

public class University {
    private String nameUniversity;
    private String location;
    private String country;

    public University(String nameUniversity, String location, String country) {
        this.nameUniversity = nameUniversity;
        this.location = location;
        this.country = country;
    }
    public String getName() {
        return nameUniversity;
    }
    public void setName(String name) {
        this.nameUniversity = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
