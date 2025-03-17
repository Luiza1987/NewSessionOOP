package oopSessions;

public class Seasons {
    int winter;
    int spring;
    int summer;
    int autumn;

    public int getSeason(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Enter month number: ");
        }
        return month;
    }

}
