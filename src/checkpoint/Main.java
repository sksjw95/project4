package checkpoint;

import checkpoint.discount.BEDiscountCondition;
import checkpoint.discount.CozDiscountCondition;
import checkpoint.products.Coffee;
import checkpoint.products.Product;
public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new CozDiscountCondition(500));

        kiosk.operate();
    }
}