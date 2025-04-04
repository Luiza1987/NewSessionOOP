package stringBuilder.IOFiles;

public class StringJoin {
    // Метод для объединения массива строк в одну строку
    public static String join(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
