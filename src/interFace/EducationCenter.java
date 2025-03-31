package interFace;

import java.time.LocalDate;

abstract class EducationCenter {
    String name;
    String locatedCountry;
    LocalDate foundationYear;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }
}
