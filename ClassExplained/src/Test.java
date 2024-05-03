class Book {
    private String title;
    private String author;

    Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Java Fundamentals");
        book.setAuthor("John Doe");
        System.out.println(book.getTitle() + " written by " + book.getAuthor());
    }
}
