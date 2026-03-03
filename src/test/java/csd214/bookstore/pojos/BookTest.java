package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    // Helper method to create a Scanner from a String
    private Scanner createMockScanner(String input) {
        return new Scanner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    void testConstructorAndGetters() {
        // Standard OOP test - no Scanner involved
        Book book = new Book("Frank Herbert", "Dune", 50.0, 10);

        assertEquals("Dune", book.getTitle());
        assertEquals("Frank Herbert", book.getAuthor());
        assertEquals(50.0, book.getPrice());
        assertEquals(10, book.getCopies());
    }

    @Test
    void testInitialize_PopulatesFieldsCorrectly() {
        // 1. Prepare the Script
        // Order in Code:
        //   1. super.initialize() -> Title
        //   2. this.initialize()  -> Author
        //   3. super.initPriceCopies() -> Copies
        //   4. super.initPriceCopies() -> Price
        String inputData = "Dune\nFrank Herbert\n10\n25.00\n";
        Scanner mockScanner = createMockScanner(inputData);

        // 2. Execute
        Book book = new Book();
        book.initialize(mockScanner); // Dependency Injection!

        // 3. Verify
        assertEquals("Dune", book.getTitle());
        assertEquals("Frank Herbert", book.getAuthor());
        assertEquals(10, book.getCopies());
        assertEquals(25.00, book.getPrice(), 0.001);
    }

    @Test
    void testEdit_UpdatesFieldsAndKeepsOthers() {
        // 1. Setup Initial State
        Book book = new Book("Old Author", "Old Title", 10.0, 5);

        // 2. Prepare the Script
        String inputData = "New Title\n\n\nNew Author\n";
        // Redirect System.in to our mock data
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));

        // 3. Execute - Note: no arguments passed here!
        book.edit();

        // 4. Verify
        assertEquals("New Title", book.getTitle());
        assertEquals(10.0, book.getPrice(), 0.001);
        assertEquals(5, book.getCopies());
        assertEquals("New Author", book.getAuthor());
    }

    @Test
    void testSellItem_DecrementsCopies() {
        Book book = new Book("Author", "Title", 10.0, 5);
        book.sellItem();
        assertEquals(4, book.getCopies());
    }
}