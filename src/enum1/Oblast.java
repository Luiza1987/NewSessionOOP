package enum1;

public enum Oblast {
    CHUY("Borbor kalaa"),
    ISSYK_KUL("Turizm"),
    TALAS("Manas Ordo"),
    NARYN("Karkyra jayloosu"),
    JALAL_ABAD("Sary-Chelek"),
    BATKEN("Orukzar"),
    OSH("Sulayman-Too");

    // Описание
    private String description;

    // Конструктор
    Oblast(String description) {
        this.description = description;
    }
    //getter and setter
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
