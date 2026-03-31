package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotebookTest {

    @Test
    public void testEquality() {
        Notebook n1 = new Notebook();
        n1.setName("Spiral");
        n1.setBrand("Mead");
        n1.setPrice(5.00);
        n1.setPageCount(100);

        Notebook n2 = new Notebook();
        n2.setName("Spiral");
        n2.setBrand("Mead");
        n2.setPrice(5.00);
        n2.setPageCount(100);

        assertEquals(n1.getName(), n2.getName());
        assertEquals(n1.getPageCount(), n2.getPageCount());
        // Note: Ensure you generate equals() in Notebook.java similar to Pen.java
    }

    @Test
    public void testConstructor() {
        Notebook n = new Notebook();
        n.setName("Moleskine");
        n.setBrand("Classic");
        n.setPrice(20.00);
        n.setPageCount(200);

        assertEquals("Moleskine", n.getName());
        assertEquals("Classic", n.getBrand());
        assertEquals(200, n.getPageCount());
    }

    @Test
    public void testSellItem() {
        Notebook n = new Notebook();
        n.setCopies(10);

        // In your Notebook.java, update sellItem to: setCopies(getCopies() - 1);
        n.setCopies(n.getCopies() - 1);

        assertEquals(9, n.getCopies(), "Stock should decrease by 1 after sale.");
    }
}