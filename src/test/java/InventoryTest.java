import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class InventoryTest {

    private Inventory inventory;
    private Keyboard keyboard;

    @Before
    public void setUp() {
        inventory = new Inventory();

        keyboard = new Keyboard(1,"Drevo", new BigDecimal(35.00), true, "ISO", "TKL");
        Keyboard keyboard1 = new Keyboard(2,"Razer",new BigDecimal(125.00), false, "ANSI", "100%");
        Keyboard keyboard2 = new Keyboard(3,"SteelSeries",new BigDecimal(95.00), true, "ISO", "60%");

        Mouse mouse = new Mouse(4, "Pictek", new BigDecimal(25.00), true, 5);
        Mouse mouse1 = new Mouse(5, "Rat", new BigDecimal(75.00), false, 4);
        Mouse mouse2 = new Mouse(6, "Logitech", new BigDecimal(40.00), false, 4);

        inventory.addItem(keyboard);
        inventory.addItem(keyboard1);
        inventory.addItem(keyboard2);
        inventory.addItem(mouse);
        inventory.addItem(mouse1);
        inventory.addItem(mouse2);
    }

    @Test
    public void testAddItem() {
        Keyboard k = new Keyboard(7,"Ortholinear",new BigDecimal(55.00), false, "ANSI", "30%");
        inventory.addItem(k);
        assertEquals(7, inventory.getEntireInventory().size());
        assertTrue(inventory.getEntireInventory().contains(k));
    }

    @Test
    public void testEditItem() {
        Mouse m = new Mouse(8, "Razer Naga", new BigDecimal(80.00), false, 14);
        inventory.editItem(6, m);
        assertTrue(inventory.getEntireInventory().contains(m));
    }

    @Test
    public void testRemoveItem() {
        inventory.removeItem(keyboard);
        assertEquals(5, inventory.getEntireInventory().size());
        assertFalse(inventory.getEntireInventory().contains(keyboard));
    }

    @Test
    public void testCheckInventoryProductName() {
        assertTrue(inventory.checkInventoryProductName("Razer"));
    }
}
