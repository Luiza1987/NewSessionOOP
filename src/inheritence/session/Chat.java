package inheritence.session;

import java.time.LocalDate;

public class Chat {
    String name;
    boolean isNew;
    LocalDate dateOfIssue;
    String designColor;

    public Chat(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        this.name = name;
        this.isNew = isNew;
        this.dateOfIssue = dateOfIssue;
        this.designColor = designColor;
    }

    public String getChatName() {
        return "Name: " + name + ", Color: " + designColor;
    }

    public boolean getIsNewChat() {
        LocalDate currentDate = LocalDate.now();
        return dateOfIssue.isAfter(currentDate.minusYears(5));
    }
}
