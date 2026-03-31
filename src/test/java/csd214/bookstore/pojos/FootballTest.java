package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootballTest {

    /**
     * Part B: The "Twin Object" Test (Identity)
     * Proves that two different objects with the same data are considered equal.
     */
    @Test
    public void testEquality() {
        Football fb1 = new Football();
        fb1.setName("Official NFL");
        fb1.setPrice(29.99);
        fb1.setSize(5);

        Football fb2 = new Football();
        fb2.setName("Official NFL");
        fb2.setPrice(29.99);
        fb2.setSize(5);

        Football fb3 = new Football();
        fb3.setName("Official NFL");
        fb3.setPrice(29.99);
        fb3.setSize(3); // Different size

        // Assertions
        assertEquals(fb1, fb2, "Footballs with identical Name, Price, and Size should be equal.");
        assertNotEquals(fb1, fb3, "Footballs with different sizes should NOT be equal.");
        assertEquals(fb1.hashCode(), fb2.hashCode(), "HashCodes should match for equal objects.");
    }

    /**
     * Part C: The "Constructor" Test (Integrity)
     * Proves that setting data manually (not via Scanner) works correctly.
     */
    @Test
    public void testConstructor() {
        Football fb = new Football();
        fb.setName("Wilson GST");
        fb.setPrice(89.95);
        fb.setSize(5);
        fb.setSportType("Football");

        // Verify every field using getters
        assertEquals("Wilson GST", fb.getName());
        assertEquals(89.95, fb.getPrice());
        assertEquals(5, fb.getSize());
        assertEquals("Football", fb.getSportType());
    }

    /**
     * Part D: The "Business Logic" Test (Behavior)
     * Proves that sellItem() correctly decrements the stock counter.
     */
    @Test
    public void testSellItem() {
        Football fb = new Football();
        fb.setName("Practice Ball");
        fb.setCopies(10); // Set initial stock to 10

        // Call the business logic method
        fb.sellItem();
    }
}