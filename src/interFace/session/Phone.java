package interFace.session;

public class Phone implements PhoneInterface {
    //polya classa
    private String brand; //brend telefona
    private String name;//model telefona
    private String password;// parol dlya blokirovki telefona
    private Contact[] contacts;// massiv contactov

    //konstruktor bez parametra
    public Phone() {
    }

    //konstructor s parametrom
    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

   //metod vklyuchenie telefona
    @Override
    public void turnOn(String password) {
        if (this.password.equals(password)) {
            System.out.println("Jaramduu parol emes");
        } else {
            System.out.println("Telefon jandy!");
        }
    }

    // metod dlya zavershenie zvonka po nomeru
    @Override
    public void call(String phoneNumber) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Siz " + contact.getFullName() + "menen suiloshup jatasyz");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact tabyldy: ");
        }
    }

    // metod dlya zavershenie zvonka po imeni
    @Override
    public void callByName(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(name)) {
                System.out.println("Siz " + contact.getFullName() + "ko" + " chalyp jatasyz, telefon nomeri: " + contact.getPhoneNumber());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact tabylgan jok");
        }
    }

    //metod dlya poiska kontakta po imeni
    @Override
    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(name)) {
                return contact;
            }
        }
        System.out.println("Contact tabylgan jok");
        return null;
    }

    //metod dlya obnovlenie imeni kontakta
    @Override
    public void updateContactName(String oldName, String newName) {
        boolean updated = false;
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(oldName)) {
                contact.updateName(oldName, newName);
                updated = true;
                System.out.println("Contacttyn aty janyrtyldy: " + oldName + " -> " + newName);
                break;
            }
        }
        if (!updated) {
            System.out.println("Contact tabylgan jok");
        }
    }

    //metod dlya poluchenie vseh kontaktov
    @Override
    public Contact[] getAllContacts() {
        return contacts;
    }
}