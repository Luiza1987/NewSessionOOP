package inheritence.session;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tak1
//        Mother mother1 = new Mother("Luiza", 38, "Black");
//        Mother mother2 = new Mother("Aitbubu", 31, "Black");
//
//        Daughter daughter1 = new Daughter("Aruuke", 12, "Black", "Black",145);
//        Daughter daughter2 = new Daughter("Amina", 6, "Black", "Brown", 135);
//
//        System.out.println(mother1.getName());
//        System.out.println(mother2.getName());
//        System.out.println(daughter1.getName());
//        System.out.println(daughter2.getName());

//        Task2

//        Scanner scanner = new Scanner(System.in);
//
//        Phone phone1 = new Phone("Телефон", "Samsung", "Galaxy S22", "+996777123456");
//        Phone phone2 = new Phone("Телефон", "Apple", "iPhone 16", "+996551220002");
//
//        Computer computer1 = new Computer("Компьютер", "HP", "Spectre x360", 32);
//        Computer computer2 = new Computer("Компьютер", "Macbook", "Air", 32);
//
//        SmartWatch watch1 = new SmartWatch("Смарт-часы", "Garmin", "Fenix 7", true);
//        SmartWatch watch2 = new SmartWatch("Смарт-часы", "Apple", "Watch Series 12", false);
//
//        System.out.println("Какую технику вы хотите включить или выключить?");
//        System.out.println("1. Телефон");
//        System.out.println("2. Компьютер");
//        System.out.println("3. Смарт-часы");
//
//        int option = scanner.nextInt();
//        scanner.nextLine();
//
//        String enteredPassword = "";
//
//        if (option == 1) {
//            System.out.print("Вы выбрали телефон. Введите пароль: ");
//            enteredPassword = scanner.nextLine();
//            if (enteredPassword.equals("1234")) {
//                System.out.println(phone1.turnOnOff(true));
//                System.out.println(phone2.turnOnOff(false));
//            } else {
//                System.out.println("Неверный пароль");
//            }
//        } else if (option == 2) {
//            System.out.print("Вы выбрали компьютер. Введите пароль: ");
//            enteredPassword = scanner.nextLine();
//            if (enteredPassword.equals("1234")) {
//                System.out.println(computer1.turnOnOff(true));
//                System.out.println(computer2.turnOnOff(false));
//            } else {
//                System.out.println("Неверный пароль");
//            }
//        } else if (option == 3) {
//            System.out.println(watch1.turnOnOff(true));
//            System.out.println(watch2.turnOnOff(false));
//        } else {
//            System.out.println("Некорректный выбор");
//        }

//        Task 4

//            WhatsApp whatsApp1 = new WhatsApp("WhatsApp1", true, LocalDate.of(2021, 5, 15),
//                    "Green", "Status", "Story");
//            Telegram telegram1 = new Telegram("Telegram1", true, LocalDate.of(2019, 1, 20),
//                    "Blue", "Channels", "Bots");
//            Instagram instagram1 = new Instagram("Instagram1", false, LocalDate.of(2018, 7, 10),
//                    "Purple", "Reels", "Stories");
//            Slack slack1 = new Slack("Slack1", true, LocalDate.of(2022, 3, 5),
//                    "Gray", "Threads", "Integrations");
//
//            Chat[] chats = {whatsApp1, telegram1, instagram1, slack1};
//
//            Chat newestChat = findNewestChat(chats);
//            System.out.println(newestChat.getChatName() + " - The newest chat");
//        }
//
//        public static Chat findNewestChat(Chat[] chats) {
//            Chat newestChat = chats[0];
//            for (Chat chat : chats) {
//                if (chat.getIsNewChat() && chat.dateOfIssue.isAfter(newestChat.dateOfIssue)) {
//                    newestChat = chat;
//                }
//            }
//            return newestChat;


//        Task 5
        // Создаем студентов с новыми номерами телефонов и адресами
        Student student1 = new Student("Ilyas", "+996551220001", "Asanbai", 30000);
        Student student2 = new Student("Zalina", "+996551220001", "Asanbai", 20000);
        Student student3 = new Student("Aika", "+996501220001", "Asanbai", 6000);
        Student student4 = new Student("Eliza", "+996501220001", "6 mkrn", 15000);
        Student student5 = new Student("Eldiyar", "+996551220001", "6 mkrn", 30000);
        Student student6 = new Student("Luiza", "+996501220001", "6 mkrn", 18000);

        // Массивы студентов для каждой квартиры
        Student[] students1 = {student1, student2, student3};
        Student[] students2 = {student4, student5, student6};

        // Создаем квартиры
        Apartment apartment1 = new Apartment("apartment1", 30000, "Asanbai", students1);
        Apartment apartment2 = new Apartment("apartment2", 50000, "6 mkrn", students2);

        // Массив всех квартир
        Apartment[] apartments = {apartment1, apartment2};

        // Запрашиваем у пользователя название квартиры
        System.out.print("Write the apartment: ");
        String consoleTitle = new Scanner(System.in).nextLine();
        apartment1.getApartment(consoleTitle, apartments); // Ищем квартиру по введенному названию

        // Выводим информацию о ежемесячной плате для студента
        System.out.println("student3.getPayPerMonth(apartments) = " + student3.getPayPerMonth(apartments));

        // Вычисляем, сколько месяцев студент может прожить в квартире
        System.out.println("student3.liveIn(students1, apartments) = " + student3.liveIn(students1, apartments));
    }


    }

