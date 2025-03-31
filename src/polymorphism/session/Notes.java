package polymorphism.session;

public class Notes extends MyPhone {
    private String note; // Хранение текста заметки

    // Метод для добавления или изменения заметки
    public void setNote(String newNote) {
        note = newNote;
    }

    // Метод для получения заметки
    public String getNote() {
        return note;
    }

    // Метод для удаления заметки
    public void deleteNote() {
        note = null;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("""
                *******************************************
                        Это приложение для заметок.
                *******************************************
                """);
    }
}

// Класс для работы с банковскими приложениями, наследующий от MyPhone
class BankApp extends MyPhone {
    private double balance; // Хранение баланса

    // Метод для проверки баланса
    public double checkBalance() {
        return balance;
    }

    // Метод для перевода денег на другую карту
    public void transferMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("     Перевод успешен! \nОстаток: " + balance);
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    // Метод для пополнения баланса
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("""
               *******************************************
                       Это банковское приложение!!!
               *******************************************
               """);
    }
}

