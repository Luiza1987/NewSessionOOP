package interFace.session;

public class Main {
    public static void main(String[] args) {
//        Task1
//        // Contact tuzuu
//        Contact contact1 = new Contact("+996501220001", "Luiza");
//        Contact contact2 = new Contact("+996702345879", "Bolot");
//        Contact[] contacts = { contact1, contact2 };
//
//        // Telefon tuzuu
//        Phone phone = new Phone("Apple", "Iphone", "23456", contacts);
//
//        // Telefondu kuiguzuu
//        phone.turnOn("1234");
//
//        // Contact menen chaluu test
//        phone.call("+996551220001");
//        phone.callByName("Bolot");
//
//        // Contact izdoo
//        Contact foundContact = phone.searchContact("Luiza");
//        if (foundContact != null) {
//            System.out.println("Contact tabyldy: " + foundContact.getFullName() + ", Number: " + foundContact.getPhoneNumber());
//        }
//
//        // Contact jany
//        phone.updateContactName("Luiza", "Aika");
//
//        // Bardyk contacttardy aluu
//        Contact[] allContacts = phone.getAllContacts();
//        for (Contact contact : allContacts) {
//            System.out.println("Contact: " + contact.getFullName() + ", Number: " + contact.getPhoneNumber());
//        }

//        Task2
        // Создание объектов форматтеров
        MessageFormatter uppercaseFormatter = new UppercaseFormatter();
        MessageFormatter lowercaseFormatter = new LowercaseFormatter();

        // Пример сообщений
        String message1 = "Hello, My dear!";

        // Применение разных форматов
        System.out.println("Верхний регистр: " + uppercaseFormatter.formatMessage(message1));
        System.out.println("Нижний регистр: " + lowercaseFormatter.formatMessage(message1));
    }
}