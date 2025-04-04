package stringBuilder.IOFiles;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        // Преобразуем строку в StringBuilder
        StringBuilder sb = new StringBuilder(text);
        // Разворачиваем строку и сравниваем с оригинальной
        return sb.reverse().toString().equalsIgnoreCase(text);
    }
}
