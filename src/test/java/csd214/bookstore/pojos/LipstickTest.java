package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LipstickTest {

    @Test
        void testEquality() {
            // Arrange
            Lipstick l = new Lipstick("100","Gloss");

            // Act & Assert
            assertEquals("100", l.getShade());
            assertEquals("Gloss", l.getFinish());
        };
    @Test
    void testSellItem(){
        Lipstick l = new Lipstick("100", "Gloss", 10);
        l.sellItem();
        assertEquals(9, l.getCount());
    }
};
