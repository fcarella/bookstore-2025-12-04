package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBookConstructorAndGetters() {
        // Constructor order MUST match AppTest:
        // Book(author, title, price, copies)
        Book book = new Book("Frank Herbert", "Dune", 25.0, 10);

        assertEquals("Frank Herbert", book.getAuthor());
        assertEquals("Dune", book.getTitle());
        assertEquals(25.0, book.getPrice());
        assertEquals(10, book.getCopies());
    }

    @Test
    void testSellItem() {
        Book book = new Book("Author", "Title", 10.0, 2);

        book.sellItem();

        assertEquals(1, book.getCopies());
    }

    @Test
    void testInitialize() {
        // Input order MUST match Book.initialize()
        String input =
                "Dune\n" +
                        "Frank Herbert\n" +
                        "5\n" +
                        "20.0\n";

        Scanner scanner = new Scanner(input);

        Book book = new Book();
        book.initialize(scanner);

        assertEquals("Dune", book.getTitle());
        assertEquals("Frank Herbert", book.getAuthor());
        assertEquals(5, book.getCopies());
        assertEquals(20.0, book.getPrice());
    }
}
