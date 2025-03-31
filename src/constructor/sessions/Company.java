package constructor.sessions;

public class Company {
    String companyName;
    String country;
    int yearOfFoundation;
    String founder;
    Group[] groups;

    Company(String companyName, String country, int yearOfFoundation, String founder, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }



}
