package com.qa.ims;

import java.math.BigDecimal;

public class Peripheral {

    private String productName;
    private BigDecimal productPrice;
    private int itemId;
    private boolean rgb;

    public Peripheral() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        if(name != null) {
            productName = name;
        }
    }

    public BigDecimal getPrice() {
        return productPrice;
    }

    public void setPrice(BigDecimal price) {
        productPrice = price;
    }

    public void setItemId(int id) {
        itemId = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setRGB(boolean r) {
        rgb = r;
    }

    public boolean getRGB() {
        return rgb;
    }
}
