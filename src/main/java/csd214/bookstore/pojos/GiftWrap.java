package csd214.bookstore.pojos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GiftWrap implements SaleableItem {
    public void sellItem() {
        System.out.println("Gift Wrapping Service Sold!");
    }
    public double getPrice(){
        System.out.println("Gift Wrapping Service Sold!");
        return 2.00;
    }
}
