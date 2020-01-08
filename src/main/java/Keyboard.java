import java.math.BigDecimal;

public class Keyboard extends Peripheral {

    private String layout;
    private String size;

    public Keyboard(int id, String name, BigDecimal price, boolean rgb, String layout, String size) {
        if((size == "100%" || size == "TKL" || size == "75%" || size == "60%" || size == "40%" || size == "30%")
                && (layout == "ANSI" || layout == "ISO")) {
            setItemId(id);
            setProductName(name);
            setPrice(price);
            setRGB(rgb);
            setLayout(layout);
            setSize(size);
        }
    }

    public void setLayout(String l) {
        if(l == "ANSI" || l == "ISO") {
            layout = l;
        }
    }

    public String getLayout() {
        return layout;
    }

    public void setSize(String s) {
        if(s == "100%" || s == "TKL" || s == "75%" || s == "60%" || s == "40%" || s == "30%") {
            size = s;
        }
    }

    public String getSize() {
        return size;
    }
}
