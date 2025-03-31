package interFace.session;

public interface PhoneInterface {
    void turnOn(String password);
    void call(String phoneNumber);
    void callByName(String name);
    Contact searchContact(String name);
    void updateContactName(String oldName, String newName);
    Contact[] getAllContacts();
}
