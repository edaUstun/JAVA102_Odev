package Book;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Book ktp1 = new Book("Atomik Aliskanliklar", 352, "James Clear", 2018);
        Book ktp2 = new Book("Yasamak", 210, "Yu Hua", 210);
        Book ktp3 = new Book("Seker Portakali", 183, "Jose Mauro De Vasconcelos", 1885);
        Book ktp4 = new Book("Ucurtma Avcisi", 375, "Khaled Hosseini", 2020);


        TreeSet<Book> books = new TreeSet<Book>();

        books.add(ktp1);
        books.add(ktp2);
        books.add(ktp3);
        books.add(ktp4);

        for (Book book : books) {
            System.out.println(String.format("Kitap adi : %s \nSayfa sayisi : %s \nYazar : %s \nYayim Tarihi : %s", book.getName(), book.getPageNum(), book.getAuthor(), book.getPublishDate()));
        }

        System.out.println("******************************");

        TreeSet<Book> book = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book k1, Book k2) {
                return k1.getPageNum() - k2.getPageNum();
            }
        });

        book.add(ktp1);
        book.add(ktp2);
        book.add(ktp3);
        book.add(ktp4);

        for (Book kitap : book) {
            System.out.println(String.format("Kitap adı : %s \nSayfa sayısı : %s \nYazar : %s \nYayım tarihi : %s",kitap.getName(),kitap.getPageNum(),kitap.getAuthor(),kitap.getPublishDate()));
        }
    }
}
