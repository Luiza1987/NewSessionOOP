package stringBuilder.IOFiles;

public class UpperCase {
    public static String capitalizeFirstLetter(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" "); // Разделяем строку на слова

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))  // Первая буква - заглавная
                    .append(word.substring(1))  // Остальная часть слова - без изменений
                    .append(" ");  // Добавляем пробел
        }

        return sb.toString().trim();  // Убираем лишний пробел в конце
    }

}
