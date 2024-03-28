public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        book1.setRating(4.2);
        book2.setRating(4.7);
        book3.setRating(4.5);

        book1.addReview("Great for beginners.");
        book2.addReview("Comprehensive and detailed.");
        book2.addReview("Excellent examples.");
        book3.addReview("Intriguing insights into fiction writing.");

        Library myLibrary = new Library();

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        User jukkiss = new User("Jukkiss", 40);
        myLibrary.addUser(jukkiss);

        System.out.println("Library Catalog:");
        myLibrary.displayBooks();

        String bookTitle = "Data Structures and Algorithms";
        if (myLibrary.isBookAvailable(bookTitle)) {
            System.out.println("The book \"" + bookTitle + "\" is available.");
            myLibrary.borrowBook(bookTitle, "Jukkiss");
        } else {
            System.out.println("The book \"" + bookTitle + "\" is not available.");
        }

        System.out.println("\nLibrary Catalog after borrowing:");
        myLibrary.displayBooks();

        myLibrary.returnBook(book2, "Jukkiss");

        System.out.println("\nBooks by Author \"Jane Doe\":");
        myLibrary.findBooksByAuthor("Jane Doe");

        System.out.println("\nAverage Book Rating:");
        System.out.println(myLibrary.getAverageBookRating());

        System.out.println("\nMost Reviewed Book:");
        Book mostReviewedBook = myLibrary.getMostReviewedBook();
        if (mostReviewedBook != null) {
            System.out.println("The most reviewed book is " + mostReviewedBook.getTitle() +
                    " with " + mostReviewedBook.getReviews().size() + " reviews.");
        } else {
            System.out.println("No reviews available.");
        }

        myLibrary.displayUsers();
    }
}
