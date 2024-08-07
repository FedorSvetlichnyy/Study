package Part4.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 1949));
        books.add(new Book("Оруэлл", "Скотный двор", 1945));
        books.add(new Book("Лукьяненко", "Три дня Индиго", 2021));
        books.add(new Book("Шринман", "Счастливая девочка", 2011));
        books.add(new Book("Альвтеген", "Стыд", 2005));
        books.add(new Book("Беляев", "Продавец воздуха", 1929));
        books.add(new Book("Кинг", "Пост сдал", 2016));
        books.add(new Book("Барикко", "Трижды на заре", 2012));
        books.add(new Book("Резерфорд", "Париж", 2015));
        books.add(new Book("Гамильтон", "Поцелуй теней", 2000));
        books.add(new Book("Каменистый", "Раб запертых земель", 2014));
        books.add(new Book("Хаксли", "Рай и Ад", 1956));
        books.add(new Book("Рот", "Инсургент", 2012));
        books.add(new Book("Леви", "Сильнее страха", 2013));
        books.add(new Book("Герритсен", "Грешница", 2003));
        books.add(new Book("Сюзанн", "Долина кукол", 1966));
        books.add(new Book("Тилье", "Переломы", 2009));
        books.add(new Book("Аллан По", "Похищенное письмо", 1844));
        books.add(new Book("Гримм", "Король Дроздобород", 2010));
        books.add(new Book("Куприн", "Впотьмах", 1893));
        books.add(new Book("Стивенс", "Похищенная", 2011));
        books.add(new Book("Мьевиль", "Рельсы", 2012));

        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        //и так далее для других читателей

        readers.get(0).getBooks().add(books.get(1));
        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}