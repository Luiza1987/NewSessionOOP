package interFace;

import java.time.LocalDate;

public class College extends EducationCenter{

    public College() {
    }

    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }
}
