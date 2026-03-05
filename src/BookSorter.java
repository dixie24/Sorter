import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSorter {
    public static void main(String[] args) {
        // Создаем нашу большую библиотеку
        List<String> books = new ArrayList<>();

        // Добавляем книги в случайном порядке
        books.add("Мастер и Маргарита — Михаил Булгаков");
        books.add("1984 — Джордж Оруэлл");
        books.add("Война и мир — Лев Толстой");
        books.add("Преступление и наказание — Федор Достоевский");
        books.add("Гарри Поттер и философский камень — Джоан Роулинг");
        books.add("Евгений Онегин — Александр Пушкин");
        books.add("Мертвые души — Николай Гоголь");
        books.add("Анна Каренина — Лев Толстой");
        books.add("Маленький принц — Антуан де Сент-Экзюпери");
        books.add("Братья Карамазовы — Федор Достоевский");
        books.add("Властелин колец — Джон Р. Р. Толкин");
        books.add("Гордость и предубеждение — Джейн Остин");
        books.add("Великий Гэтсби — Фрэнсис Скотт Фицджеральд");
        books.add("Убить пересмешника — Харпер Ли");
        books.add("Над пропастью во ржи — Джером Сэлинджер");
        books.add("Сто лет одиночества — Габриэль Гарсиа Маркес");
        books.add("Божественная комедия — Данте Алигьери");
        books.add("Илиада — Гомер");
        books.add("Граф Монте-Кристо — Александр Дюма");
        books.add("Три товарища — Эрих Мария Ремарк");
        books.add("Алхимик — Пауло Коэльо");
        books.add("Идиот — Федор Достоевский");
        books.add("Джейн Эйр — Шарлотта Бронте");
        books.add("Вишневый сад — Антон Чехов");
        books.add("Отцы и дети — Иван Тургенев");
        books.add("Собачье сердце — Михаил Булгаков");
        books.add("Золотой теленок — Ильф и Петров");
        books.add("Капитанская дочька");
        books.add("Ак кеме");
        books.add("1984- George O.")

        System.out.println("=== Библиотека до сортировки ===");
        printBooks(books);

        // Магия сортировки одной строкой!
        Collections.sort(books);

        System.out.println("\n=== Отсортированная библиотека (А-Я) ===");
        printBooks(books);
    }

    private static void printBooks(List<String> list) {
        for (String book : list) {
            System.out.println("- " + book);
        }
    }
}