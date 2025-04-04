package stringBuilder;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Song с необходимыми данными
        String title = "Beautiful Day";
        String author = "UPPERROOM";
        String text = "Thank You for joy\n" +
                "Thank You for pain\n" +
                "It's a beautiful day\n" +
                "It's a beautiful day\n" +
                "That's all\n\n" +
                "Lord, thank You for sunshine\n" +
                "Thank You for rain\n" +
                "Thank You for joy\n" +
                "Thank You for pain\n" +
                "It's a beautiful day\n" +
                "It's a beautiful day\n\n" +
                "Sing that again";

        // Создаём объект песни
        Song song = new Song(new File("beautiful_day.txt"), title, author, text);

        // Выводим информацию о песне
        song.printSongDetails();
    }
}
