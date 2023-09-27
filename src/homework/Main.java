package homework;

public class Main {
    public static void main() {

    }
    public class Book {
        //объявляем поля класса Воок
        private String title;
        private Author author;
        private int publishingYear;
        //создаём конструктор класса Book
        public Book (String title, Author author, int publishingYear) {
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
    public class Author {
        //объявляем поля класса Author
        private String name;
        private String secondName;
        //создаём конструктор класса Author
        public Author (String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
        }
    }
}
