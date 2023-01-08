package checkpoint.discount;

import  java.util.Scanner;

public class BEDiscountCondition implements DiscountCondition {
    private  int discountRate;

    public BEDiscountCondition(int discountRate){
        this.discountRate = discountRate;
    }
    private boolean checkDiscountCondition(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("코드스테이츠 백엔드 코스 수강생이십니까? (1_예 (2)_아니오)");

        String input = scanner.nextLine();

        if(input.equals("1")) return  true;
        else return false;
    }

    private  int calculateDiscountedPrice(int price) {
        return  price - ( price * discountRate / 100 );
    }

    public int discount(int price){
        if (checkDiscountCondition()) return  calculateDiscountedPrice(price);
        else return  price;
    }
}
