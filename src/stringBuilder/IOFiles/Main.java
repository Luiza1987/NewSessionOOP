package stringBuilder.IOFiles;

import static stringBuilder.IOFiles.AsciiConverter.convertToAscii;
import static stringBuilder.IOFiles.Palindrome.isPalindrome;
import static stringBuilder.IOFiles.SpaceRemover.removeSpaces;
import static stringBuilder.IOFiles.UpperCase.capitalizeFirstLetter;
import static stringBuilder.IOFiles.VowelCounter.countVowels;
import static stringBuilder.IOFiles.WordCounter.countWords;

public class Main {
    public static void main(String[] args) {
        // Home work
        //1.....
        String original = "Привет Солнышко!";
        String reversed = StringReverser.reverse(original);
        System.out.println("1) StringReverser: ");
        System.out.println(reversed);  // Выведет: !окнышлоС тевирП

        //2....
        String[] words = {"Привет", " ", "Солнышко", "!", " ", "Спасибо, что ярко светишься!"};
        String result = StringJoin.join(words);
        System.out.println("2) StringJoin: ");
        System.out.println(result);
        // Выведет: Привет Солнышко! Спасибо, что ярко светишься!

        //3.....
        String text = "Привет Солнышко! Спасибо, что ярко светишься!";
        System.out.println("3) Количество гласных: " + countVowels(text));

        //4.....
        String text1 = "Привет Солнышко! Спасибо, что ярко светишься!";
        System.out.println("4) Palindrome checker: ");
        if (isPalindrome(text1)){
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

        //5.....
        String text2 = "привет солнышко! спасибо, что ярко светишься!";
        System.out.println("5) Uppercase: ");
        System.out.println(capitalizeFirstLetter(text2));

        //6.....
        String text3 = "Привет Солнышко! Спасибо, что ярко светишься!";
        System.out.println("6) Количество слов: " + countWords(text));

        //7.....
        String text4 = "Привет Солнышко!";
        System.out.println("7) AsciiConverter: ");
        System.out.println(convertToAscii(text4));

        //8.....
        String text5 = "Привет Солнышко! Спасибо, что ярко светишься!";
        System.out.println("8) RemoveSpaces: ");
        System.out.println(removeSpaces(text5));  // Выводим строку без пробелов
    }
}
