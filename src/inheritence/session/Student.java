package inheritence.session;

public class Student {
    private String fullName;  // Полное имя студента
    private String phoneNumber; // Номер телефона
    private String address;   // Адрес студента
    private int bankAccount;  // Баланс на банковском счете

    // Конструктор по умолчанию
    public Student() {
    }

    // Конструктор с параметрами
    public Student(String fullName, String phoneNumber, String address, int bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    // Геттеры и сеттеры для полей класса
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Метод для вычисления ежемесячной платы за квартиру (в данном случае разделена на 3 части)
    public int getPayPerMonth(Apartment[] apartments) {
        for (Apartment apartment : apartments) {
            return apartment.getPrice() / 3; // Цена квартиры делится на 3 равные части
        }
        return 0; // Если квартиры нет, возвращаем 0
    }

    // Метод для вычисления, сколько месяцев студент может прожить в квартире в зависимости от своего банковского счета
    public int liveIn(Student[] students, Apartment[] apartments) {
        int apartmentPrice = getPayPerMonth(apartments); // Получаем ежемесячную плату
        for (Student student : students) {
            System.out.println("student.bankAccount = " + student.bankAccount);
            return (student.getBankAccount() / apartmentPrice); // Рассчитываем количество месяцев, которые студент может прожить
        }
        return 0; // Если студент не может прожить, возвращаем 0
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
