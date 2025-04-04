package stringBuilder;

import java.io.File;

public class Song {
    // Свойства класса Song
    private File file;  // файл, который содержит текст песни
    private String title;  // название песни
    private String author;  // автор песни
    private String text;  // текст песни

    // Конструктор класса для инициализации песни
    public Song(File file, String title, String author, String text) {
        this.file = file;
        this.title = title;
        this.author = author;
        this.text = text;
    }

    // Геттеры и сеттеры для доступа к полям
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Метод для вывода информации о песне на консоль
    public void printSongDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Text: \n" + text);
    }
}