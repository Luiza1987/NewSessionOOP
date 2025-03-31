package enum1;

public enum DayWeek {
    //kundordu anyktoo jana kyrgazcha attaryn beruu
    MONDAY("Дуйшомбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    // kyrgyzcha atyn saktoo
    private final String kyrgyzName;

    // konstructor
    DayWeek(String kyrgyzName) {
        this.kyrgyzName = kyrgyzName;
    }

    // kyrgyzcha atyn kaitaruu metod
    public String getKyrgyzName() {
        return this.kyrgyzName;
    }
}


