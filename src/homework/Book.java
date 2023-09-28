package homework;

import java.util.Objects;

public class Book {
    //объявляем поля класса Воок
    private String title;
    private Author author;
    private int publishingYear;

    //создаём конструктор класса Book
    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    //геттер поля title (название)
    public String getTitle() {
        return title;
    }
    //геттер поля author (автор)
    public Author getAuthor() {
        return author;
    }
    //геттер "вернуть имя автора"
    public String getAuthorName() {
        return author.getName() + " " + author.getSecondName();
    }
    //геттер поля publoshingYear (год издания)
    public int getPublishingYear() {
        return publishingYear;
    }
    //сеттер поля publoshingYear (год издания) с проверкой валидности
    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2023) {
            System.out.println("Некорректный год издания:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }
}

