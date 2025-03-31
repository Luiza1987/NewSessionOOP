package inheritence.session;

import java.time.LocalDate;

public class Telegram extends Chat{
    String characteristic1;
    String characteristic2;

    public Telegram(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                    String characteristic1, String characteristic2) {
        super(name, isNew, dateOfIssue, designColor);
        this.characteristic1 = characteristic1;
        this.characteristic2 = characteristic2;
    }

    public String getCharacteristic() {
        return "Telegram Characteristics: " + characteristic1 + ", " + characteristic2;
    }

    @Override
    public String getChatName() {
        return super.getChatName() + ", Telegram Specific Characteristic: " + characteristic2;
    }
}
