package homework;

import java.util.Objects;

public class Author {

    //объявляем поля класса Author
    private String name;
    private String secondName;

    //создаём конструктор класса Author
    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
    //создаём геттер поля name
    public String getName() {
        return name;
    }
    //создаём геттер поля secondname
    public String getSecondName() {
        return secondName;
    }
    //переопределяем метод toString()
    @Override
    public String toString() {
        return this.name + " " + this.secondName;
    }
    //переопределяем метод equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(secondName, author.secondName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}
