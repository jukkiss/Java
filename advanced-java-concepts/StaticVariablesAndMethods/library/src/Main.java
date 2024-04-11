import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember member1 = new LibraryMember("John Doe", 1);
        Book book1 = new Book("The Java Programming Language", "Author Name", "123456");

        library.addBook(book1);
        library.addMember(member1);

        library.reserveBook(member1, book1);

        library.cancelReservation(member1, book1);

        library.displayReservedBooks(member1);

    }
}
