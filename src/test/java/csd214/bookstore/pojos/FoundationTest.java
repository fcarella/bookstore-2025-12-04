package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoundationTest {
    @Test
    void testEquality() {
        // Arrange
        Foundation f = new Foundation("100","Full Coverage");

        // Act & Assert
        assertEquals("100", f.getShade());
        assertEquals("Full Coverage", f.getCoverage());
    };
    @Test
    void testSellItem(){
        Foundation f = new Foundation("100", "Full Coverage", 10);
        f.sellItem();
        assertEquals(9, f.getCount());
    }
};

