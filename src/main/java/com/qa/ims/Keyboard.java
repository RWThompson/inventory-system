package com.qa.ims;

import java.math.BigDecimal;

public class Keyboard extends Peripheral {

    private String layout;
    private String size;

    public Keyboard(int id, String name, BigDecimal price, boolean rgb, String layout, String size) {
        if((size.equals("100%") || size.equals("TKL") || size.equals("75%") || size.equals("60%")
                || size.equals("40%") || size.equals("30%")) && (layout.equals("ANSI") || layout.equals("ISO"))) {
            setItemId(id);
            setProductName(name);
            setPrice(price);
            setRGB(rgb);
            setLayout(layout);
            setSize(size);
        }
    }

    public void setLayout(String l) {
        if(l.equals("ANSI") || l.equals("ISO")) {
            layout = l;
        }
    }

    public String getLayout() {
        return layout;
    }

    public void setSize(String s) {
        if(s.equals("100%") || s.equals("TKL") || s.equals("75%") || s.equals("60%")
                || s.equals("40%") || s.equals("30%")) {
            size = s;
        }
    }

    public String getSize() {
        return size;
    }
}
