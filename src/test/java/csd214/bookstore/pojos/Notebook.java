package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {

    @Test
    void testConstructor() {
        Notebook n = new Notebook("Math", 200, 5.99);

        assertEquals("Math", n.getName());
        assertEquals(200, n.getPages());
        assertEquals(5.99, n.getPrice());
    }
}
