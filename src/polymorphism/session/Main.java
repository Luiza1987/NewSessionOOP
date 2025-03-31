package polymorphism.session;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Task1

//   Sheep[] farm1Sheeps = {
//           new Sheep("Sheep1",3,"White", 40),
//           new Sheep("Sheep2",5,"Black",45),
//           new Sheep("Sheep3",3,"White", 55)
//   };
//
//   Cow[] farm1Cows = {
//           new Cow("Cow1","Black",90,9),
//           new Cow("Cow2","Black",50,4),
//           new Cow("Cow3","White",70,9),
//           new Cow("Cow4","Brown",80,7),
//           new Cow("Cow5","Black",40,3),
//   };
//
//   Horse[] farm1Horse = {
//           new Horse("Horse1","White",3,55),
//           new Horse("Horse2","Black",5,75),
//   };
//   Farm farm1 = new Farm("Ala-Too", farm1Sheeps, farm1Cows, farm1Horse,"Замир");

//        Task 2
//
//                Sport[] sports = new Sport[3];
//                sports[0] = new Football("Команда A", "Профессиональный", 11);
//                sports[1] = new Swimming("Команда B", "Любительский", 4);
//                sports[2] = new Basketball("Команда C", "Профессиональный", 5);
//
//                // Печать профессиональных видов спорта
//                System.out.println("Профессиональные виды спорта:");
//                for (Sport sport : sports) {
//                    if (sport.isProfessional()) {
//                        System.out.println(sport.getTeamName());
//                    }
//                }
//
//                // Поиск команды по имени
//                String searchTeam = "Команда A";
//                System.out.println("\nИщем команду: " + searchTeam);
//                for (Sport sport : sports) {
//                    if (sport.findByTeamName(searchTeam)) {
//                        System.out.println("Найдена команда: " + sport.getTeamName());
//                    }
//                }

        // Task 3
        // Создаем объект Scanner
        Scanner scanner = new Scanner(System.in);

        // Работа с заметками
        Notes myNotes = new Notes();
        myNotes.showInfo();
        System.out.print("Введите заметку: ");
        String noteInput = scanner.nextLine(); // Чтение заметки
        myNotes.setNote(noteInput);
        System.out.println("Моя заметка: " + myNotes.getNote());
        myNotes.deleteNote();
        System.out.println("Заметка после удаления: " + myNotes.getNote());

        // Работа с банковским приложением
        BankApp myBank = new BankApp();
        myBank.showInfo();
        System.out.print("Введите сумму для пополнения счета: ");
        double depositAmount = scanner.nextDouble(); // Чтение суммы для пополнения
        myBank.deposit(depositAmount);
        System.out.println("Баланс: " + myBank.checkBalance());

        System.out.print("Введите сумму для перевода: ");
        double transferAmount = scanner.nextDouble(); // Чтение суммы перевода
        myBank.transferMoney(transferAmount);
        System.out.println("Баланс после перевода: " + myBank.checkBalance());

        // Работа с калькулятором
        Calculator myCalc = new Calculator();
        myCalc.showInfo();

        System.out.print("Введите первое число для калькулятора: ");
        double num1 = scanner.nextDouble(); // Чтение первого числа
        System.out.print("Введите второе число для калькулятора: ");
        double num2 = scanner.nextDouble(); // Чтение второго числа

        System.out.println("Сумма: " + myCalc.add(num1, num2));
        System.out.println("Разность: " + myCalc.subtract(num1, num2));
        System.out.println("Произведение: " + myCalc.multiply(num1, num2));
        System.out.println("Частное: " + myCalc.divide(num1, num2));
       }

    }

