package csd214.bookstore;

import csd214.bookstore.pojos.Book;
import csd214.bookstore.pojos.Pen;
import csd214.bookstore.pojos.SaleableItem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private final InputStream originalSystemIn = System.in;

    @AfterEach
    void tearDown() {
        System.setIn(originalSystemIn);
    }

    @Test
    void testAppFlow_AddAndEditBook() {
        // 1. Build the Clean Script
        StringBuilder script = new StringBuilder();

        // --- ADD BOOK ---
        script.append("1\n");             // Main Menu: Add Items
        script.append("1\n");             // Add Menu: Add Book
        script.append("Dune\n");          // Title
        script.append("Frank Herbert\n"); // Author
        script.append("10\n");            // Copies
        script.append("25.00\n");         // Price
        script.append("99\n");            // Exit Add Menu

        // --- EDIT BOOK ---
        script.append("2\n");             // Main Menu: Edit Items
        script.append("0\n");             // Select Index 0
        script.append("Dune Messiah\n");  // Change Title
        script.append("\n");              // Price: Keep
        script.append("\n");              // Copies: Keep
        script.append("\n");              // Author: Keep

        // --- QUIT ---
        script.append("99\n");            // Quit

        // 2. Inject
        System.setIn(new ByteArrayInputStream(script.toString().getBytes()));

        // 3. Run
        App app = new App() {
            @Override
            public void populate() { /* clean start */ }
        };
        app.run();

        // 4. Verify
        Book expected = new Book("Frank Herbert", "Dune Messiah", 25.00, 10);
        SaleableItem result = app.findItem(expected);

        assertNotNull(result);
        assertEquals("Dune Messiah", ((Book)result).getTitle());
    }
    @Test
    void testAppFlow_AddPen() {
        App app = new App();

        String script = String.join("\n",
                "1",        // Main menu → Add Items
                "2",        // Add Pen

                "2.99",     // Price
                "10",       // Copies
                "Bic",      // Brand (Stationary)
                "Blue",     // Pen Color
                "Bic",      // Pen Brand

                "99",       // Exit Add Item menu
                "99"        // Quit app
        ) + "\n";

        System.setIn(new ByteArrayInputStream(script.getBytes()));

        app.run();

        Pen expected = new Pen("Bic", "Blue", 2.99, 10);

        assertNotNull(app.findItem(expected));
    }

}