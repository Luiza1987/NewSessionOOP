package Encapsulation;

import java.time.LocalDate;

public class Car {
    private String marka;
    private String color;
    private LocalDate dateOfBirth;

    public Car (String marka, String color,LocalDate dateOfBirth) {
        this.marka = marka;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String  getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
