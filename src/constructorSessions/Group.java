package constructorSessions;

public class Group {
    String groupName;
    String  startDate;
    String mentor;
    Person[] people;

    Group(String groupName, String startDate, String mentor, Person[] people) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.people = people;
    }
}
