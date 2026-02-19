package csd214.bookstore.pojos;
import csd214.pojos.ActionGame;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ActionGameTest {

    @Test
    public void testConstructor() {
        // Arrange: create object using loaded constructor
        ActionGame game = new ActionGame("Call of Duty", "PS5", 75.99, 10);

        // Assert: verify values were saved correctly via getters
        assertEquals("Call of Duty", game.getName());
        assertEquals("PS5", game.getPlatform());
        assertEquals(75.99, game.getPrice());
    }

}
