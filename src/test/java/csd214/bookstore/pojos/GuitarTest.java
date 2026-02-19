package csd214.bookstore.pojos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GuitarTest {

    @Test
    void testConstructorAndGetters() {
        Guitar guitar = new Guitar("Fender", 999.00, 6, 10);
        assertEquals("Fender", guitar.getBrand());
        assertEquals(999.00, guitar.getPrice());
        assertEquals(6, guitar.getNumStrings());
        assertEquals(10, guitar.getCopies());
    }
    @Test
    void testSellItem() {
        Guitar guitar = new Guitar("Yamaha", 799.00, 6, 5);

        guitar.sellItem();
        assertEquals(4, guitar.getCopies());
    }
    @Test
    void testEquality() {

        Guitar g1 = new Guitar("Ibanez", 500.00, 6, 3);
        Guitar g2 = new Guitar("Ibanez", 500.00, 6, 3);
        Guitar g3 = new Guitar("Ibanez", 500.00, 7, 3);

        assertEquals(g1, g2);
        assertEquals(g1.hashCode(), g2.hashCode());
        assertNotEquals(g1, g3);
    }
}
