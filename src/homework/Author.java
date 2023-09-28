package homework;

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

}
