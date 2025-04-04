package stringBuilder.IOFiles;

public class WordCounter {
    public static int countWords(String text) {
        StringBuilder StringBuilder = new StringBuilder(text.trim());
        String[] words = StringBuilder.toString().split(" ");  // Разделяем строку по пробелам
        return words.length;  // Возвращаем количество слов
    }
}
