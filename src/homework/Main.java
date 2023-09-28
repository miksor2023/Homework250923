package homework;

public class  Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author pushkin = new Author("Александр", "Пушкин");
        Book masterIMargarita = new Book("Мастер и Маргарита", bulgakov, 1997);
        Book poltava = new Book("Полтава", pushkin, 1986);
        System.out.println(masterIMargarita.getAuthorName() + ", " + masterIMargarita.getTitle() + ", " + masterIMargarita.getPublishingYear());
        System.out.println(masterIMargarita.getAuthor());
        System.out.println(pushkin.getName() + " " + pushkin.getSecondName());
        masterIMargarita.setPublishingYear(2000);
        System.out.println(masterIMargarita.getPublishingYear());
    }
}

