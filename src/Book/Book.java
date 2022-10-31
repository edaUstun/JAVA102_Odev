package Book;

public class Book implements Comparable<Book>{


    private final String name;
    private final int pageNum;
    private final String author;
    private final int publishDate;


    public Book(String name, int pageNum, String author, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishDate() {
        return publishDate;
    }



    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }
}
