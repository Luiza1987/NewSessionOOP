package stringBuilder.IOFiles;

public class AsciiConverter {
    public static String convertToAscii(String text) {
        StringBuilder sb = new StringBuilder();

        for (char ch : text.toCharArray()) {
            sb.append((int) ch).append(" ");  // Преобразуем символ в ASCII и добавляем пробел
        }

        return sb.toString().trim();  // Убираем последний пробел
    }
}
