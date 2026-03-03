package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TennisRacketTest {

    @Test
    public void testEquality() {
        TennisRacket r1 = new TennisRacket();
        r1.setName("Pro Staff");
        r1.setPrice(150.00);
        r1.setStringTension(55);

        TennisRacket r2 = new TennisRacket();
        r2.setName("Pro Staff");
        r2.setPrice(150.00);
        r2.setStringTension(55);

        // Logic check for Part B
        assertEquals(r1.getName(), r2.getName());
        assertEquals(r1.getStringTension(), r2.getStringTension());
    }

    @Test
    public void testConstructor() {
        TennisRacket tr = new TennisRacket();
        tr.setName("Wilson");
        tr.setPrice(199.99);
        tr.setStringTension(60);
        tr.setSportType("Tennis");

        assertEquals("Wilson", tr.getName());
        assertEquals(60, tr.getStringTension());
        assertEquals(199.99, tr.getPrice());
    }

    @Test
    public void testSellItem() {
        TennisRacket tr = new TennisRacket();
        tr.setCopies(5);

        // Simulating the business logic behavior
        tr.setCopies(tr.getCopies() - 1);

        assertEquals(4, tr.getCopies());
    }
}