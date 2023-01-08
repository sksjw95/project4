package checkpoint.discount;

import java.util.Scanner;

public class CozDiscountCondition implements DiscountCondition {
    private  int discountAmount;

    public  CozDiscountCondition(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    private  boolean checkDiscountCondition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("코드스테이츠 수강생이십니까? (1)_예 (2)_아니오");

        String input = scanner.nextLine();

        if (input.equals("1")) return  true;
        else return false;
    }

    private  int calculateDiscountedPrice(int price) {
        return  price - discountAmount;
    }

    public  int discount(int price) {
        if (checkDiscountCondition()) return calculateDiscountedPrice(price);
        else return  price;
    }
}
