package interFace.session;

public class Contact {
    private String phoneNumber;//nomer telefona
    private String fullName;// polnoe imya contacta

    //constructor bez parametra
    public Contact() {
    }

    //constructor s parametrom
    public Contact(String phoneNumber, String fullName) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    //Getter
    //metod dlya poluchenie nomera telefone
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // metod dlya polucheniya polnogo imeni contacta
    public String getFullName() {
        return fullName;
    }

    //metod dlya izmeneniya imeni contacta
    public void updateName(String oldName, String newName) {
        if (this.fullName.equals(oldName)) {
            this.fullName = newName;
        }
    }
}