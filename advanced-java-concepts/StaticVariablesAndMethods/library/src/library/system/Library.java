package library.system;

import library.model.Book;
import library.model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(book.getTitle() + " reserved successfully for " + member.getName() + ".");
        } else {
            System.out.println(book.getTitle() + " is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved()) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation for " + book.getTitle() + " canceled successfully for " + member.getName() + ".");
        } else {
            System.out.println(book.getTitle() + " was not reserved by " + member.getName() + ".");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        System.out.println(member.getName() + " borrowed " + book.getTitle());
    }

    public void returnBook(LibraryMember member, Book book) {
        System.out.println(member.getName() + " returned " + book.getTitle());
    }
}
