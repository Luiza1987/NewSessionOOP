package inheritence.session;

import java.time.LocalDate;

public class WhatsApp extends Chat {
    String characteristic1;
    String characteristic2;

    public WhatsApp(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                    String characteristic1, String characteristic2) {
        super(name, isNew, dateOfIssue, designColor);
        this.characteristic1 = characteristic1;
        this.characteristic2 = characteristic2;
    }

    public String getCharacteristic() {
        return "WhatsApp Characteristics: " + characteristic1 + ", " + characteristic2;
    }

    @Override
    public String getChatName() {
        return super.getChatName() + ", WhatsApp Specific Characteristic: " + characteristic1;
    }

}
