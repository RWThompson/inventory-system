package com.qa.ims;

import java.math.BigDecimal;
import java.util.List;

public class Sale {

    private int orderNumber;
    private List<Peripheral> list;
    private BigDecimal bill;

    public BigDecimal getBill() {
        return bill;
    }

    public Sale(int orderNo, List<Peripheral> peripherals) {
        orderNumber = orderNo;
        list = peripherals;
        bill = BigDecimal.ZERO;
    }

    public BigDecimal getTotalCost () {
        for(Peripheral peripheral : list) {
            BigDecimal cost = peripheral.getPrice();
            bill = bill.add(cost);
        }
        return bill;
    }

    public void applyDiscoutPercentage(BigDecimal discount) {
        BigDecimal tmp = new BigDecimal(1.00);
        BigDecimal disc = new BigDecimal(100.00);
        disc = discount.divide(disc);
        disc = tmp.subtract(disc);
        bill = bill.multiply(disc).setScale(2);
    }

    public void applyDiscoutSpecifiedAmount(BigDecimal discount) {
        bill = bill.subtract(discount);
    }

}
