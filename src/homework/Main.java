package homework;

public class  Main {
    public static void main(String[] args) {
        //созда ём объекты, заполняем поля
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author pushkin = new Author("Александр", "Пушкин");
        Book masterIMargarita = new Book("Мастер и Маргарита", bulgakov, 1997);
        Book poltava = new Book("Полтава", pushkin, 1986);
        //делаем проверки вывода
        System.out.println(bulgakov);
        System.out.println(pushkin);
        masterIMargarita.setPublishingYear(2000);
        System.out.println(masterIMargarita.getPublishingYear());
        System.out.println(poltava);
        System.out.println(masterIMargarita);
    }
}

