import java.math.BigDecimal;

public class Mouse extends Peripheral {

    private int numberOfButtons;

    public Mouse(int id, String name, BigDecimal price, boolean rgb, int num) {
        setItemId(id);
        setProductName(name);
        setPrice(price);
        setRGB(rgb);
        setNumberOfButtons(num);
    }

    public void setNumberOfButtons(int n) {
        numberOfButtons = n;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }
}
