package stringBuilder.IOFiles;

public class StringReverser {
    // Метод для переворота строки
    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
