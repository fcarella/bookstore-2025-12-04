package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LipstickTest {
        @Test
        void testEquality() {
            // Arrange
            Lipstick l = new Lipstick("Dior", "Pink", 40);

            // Act & Assert
            assertEquals("Dior", l.getShade ());

            assertEquals(l.hashCode(), l.hashCode(), "HashCodes must match");
        };
};
