package enum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //ClassWork
//        for (Oblast oblast : Oblast.values()) {
//            System.out.println(oblast + ": " + oblast.getDescription());
//        }

//        //HomeWork
//        // Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // jumanyn kundorun konsolgo chygarynyz
//        System.out.println("Жуманын күндору:");
//        for (DayWeek day : DayWeek.values()) {
//            System.out.println(day.getKyrgyzName());
//        }
//
//        // kundun sanyn kirgizuu
//        System.out.println("\nКайсы кунду тандайсыз? (1 - Дуйшомбу, 2 - Шейшемби, 3 - Шаршемби," +
//                " 4 - Бейшемби, 5 - Жума, 6 - Ишемби, 7 - Жекшемби):");
//        int inputDay = scanner.nextInt();
//
//        // kirgizgen sanga jarasha kun tandoo
//        DayWeek selectedDay;
//        switch (inputDay) {
//            case 1:
//                selectedDay = DayWeek.MONDAY;
//                break;
//            case 2:
//                selectedDay = DayWeek.TUESDAY;
//                break;
//            case 3:
//                selectedDay = DayWeek.WEDNESDAY;
//                break;
//            case 4:
//                selectedDay = DayWeek.THURSDAY;
//                break;
//            case 5:
//                selectedDay = DayWeek.FRIDAY;
//                break;
//            case 6:
//                selectedDay = DayWeek.SATURDAY;
//                break;
//            case 7:
//                selectedDay = DayWeek.SUNDAY;
//                break;
//            default:
//                System.out.println("Жарактуу кун киргизиниз.");
//                return;
//        }
//
//        // kundu kaisy sabakty okuganyn korsotot
//        switch (selectedDay) {
//            case MONDAY:
//                System.out.println("Дуйшомбу куну жава окуйм.");
//                break;
//            case TUESDAY:
//                System.out.println("Шейшемби куну жава жана англис тили сабагын окуйм.");
//                break;
//            case WEDNESDAY:
//                System.out.println("Шаршемби куну жава окуйм.");
//                break;
//            case THURSDAY:
//                System.out.println("Бейшемби куну жава окуйм.");
//                break;
//            case FRIDAY:
//                System.out.println("Жума куну жава жана англис тили сабагын окуйм.");
//                break;
//            case SATURDAY:
//                System.out.println("Ишемби куну эс алам.");
//                break;
//            case SUNDAY:
//                System.out.println("Жекшемби куну эс алам.");
//                break;
//        }

        //Classwork
        Scanner scanner = new Scanner(System.in);

        Card card = new Card("Luiza", "Zakirova", "1234-5678-1234-5678",
                500, "1234");
        Product apple = new Product("Apple", 100);
        Product milk = new Product("Milk", 120);
        Product bread = new Product("Bread", 40);
        Basket basket = new Basket(new Product[]{apple, milk, bread});
        Client client = new Client("Luiza", "Zakirova", 38, card, basket);

        double totalAmount = basket.getTotalPrice();
        System.out.println("Кош келиниз!");

        if (totalAmount > 100) {
            System.out.print("Паролду киргизиниз: ");
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equals(card.getPassword())) {
                System.out.println("Туура эмес пароль!");
                return;
            }
        }
        client.payWithCard(totalAmount);
    }
}

