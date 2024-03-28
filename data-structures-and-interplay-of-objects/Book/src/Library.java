import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, User> users = new HashMap<>(); // Maps user names to User objects

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found book by " + author + ": " + book.getTitle() + " (" + book.getPublicationYear() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by " + author);
        }
    }

    public void borrowBook(String title, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.borrowBook(book);
                books.remove(i);
                System.out.println(userName + " has borrowed: " + title);
                return;
            }
        }
        System.out.println(title + " not available");
    }

    public void returnBook(Book book, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (user.getBorrowedBooks().remove(book)) {
            books.add(book);
            System.out.println(userName + " has returned: " + book.getTitle());
        } else {
            System.out.println(userName + " did not borrow: " + book.getTitle());
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewedBook = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }
        System.out.println("Library Users:");
        for (User user : users.values()) {
            System.out.println(user.getName() + ", Age: " + user.getAge());
            user.displayBorrowedBooks();
        }
    }
}
