package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NotebookTest { @Test
void testEquality(){
    Notebook n1 = new Notebook ("Pilot", 10);
    Notebook n2 = new Notebook("Pilot", 10);
    Notebook n3 = new Notebook("Five Star", 20);
    assertEquals(n1, n2, "Notebooks with the same state should be equal");
    assertEquals(n1.hashCode(), n2.hashCode(), "HashCodes must match");
    assertNotEquals(n1,n3, "Different pageCount notebooks should not be equal");
    };
};
