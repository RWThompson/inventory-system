import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SaleTest {

    private List<Peripheral> list;
    private Sale sale;

    @Before
    public void setUp() {
        list = new ArrayList<Peripheral>();
        Keyboard keyboard = new Keyboard(1, "Drevo", new BigDecimal(40.00), true, "ISO", "75%");
        Mouse mouse = new Mouse(2, "Razer", new BigDecimal(77.00), false, 14);
        list.add(keyboard);
        list.add(mouse);

        sale = new Sale(1, list);
    }

    @Test
    public void testGetTotalCost() {
        BigDecimal exp = new BigDecimal(117.00);
        assertEquals(exp, sale.getTotalCost());
    }

    @Test
    public void testApplyDiscountPercentage() {
        BigDecimal exp = new BigDecimal(0);
        exp = BigDecimal.valueOf(93.60).setScale(2);
        sale.getTotalCost();
        sale.applyDiscoutPercentage(new BigDecimal(20.00));
        assertEquals(exp, sale.getBill());
    }

    @Test
    public void testApplyDiscountSpecifiedAmount() {
        BigDecimal exp = new BigDecimal(97.00);
        sale.getTotalCost();
        sale.applyDiscoutSpecifiedAmount(new BigDecimal(20.00));
        assertEquals(exp, sale.getBill());
    }
}
