package checkpoint.products;

import  java.util.Scanner;
public class Tea extends Product {
    private boolean noTeabag;

    public Tea(int id, String name, int price, boolean noTeabag){
        super(id, name, price);
        this.noTeabag = noTeabag;
    }
    private  void  setNoTeabag(boolean noTeabag) {
        this.noTeabag = noTeabag;
    }

    public  void applyOption(){
        System.out.println("티백을 빼드릴까요? (1)_예 (2)_아니오");

        Scanner scanner = new Scanner(System.in);

        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) setNoTeabag(true);

    }
    public String getOptionToString(){
        return noTeabag ? "(티백 제거)" : "";
    }

}
