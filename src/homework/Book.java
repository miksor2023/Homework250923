package homework;

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
    public String getAuthor() {
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
}

