package Constructor;

public class Family {
    String fatherName;
    String motherName;
    int childrenCount;
    String animal;

    public Family() {
        this.fatherName = "Unknown";
        this.motherName = "Unknown";
        this.childrenCount = 0;
        this.animal = "Unknown";
    }

    public Family(String fatherName, String motherName, int childrenCount, String animal) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.childrenCount = childrenCount;
        this.animal = animal;
    }

    public Family(String motherName, int childrenCount, String animal) {
        this("Unknown", motherName, childrenCount, animal);
    }

    public Family(String fatherName, String motherName, int childrenCount) {
        this(fatherName, motherName, childrenCount, "Unknown");
    }

    public Family(String fatherName, String motherName, String animal) {
        this(fatherName, motherName, 0, animal);
    }

    public String toString() {
        return "Father's Name: " + fatherName + "\n" +
                "Mother's Name: " + motherName + "\n" +
                "Children Count: " + childrenCount + "\n" +
                "Animal: " + animal + "\n" +
                "----------------------------";
    }
}