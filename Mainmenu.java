package Kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu extends Order{

    public ArrayList<Order> orderList = new ArrayList<>();


    Order order = new Order();


    public void showMainMenu(){

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Burgers.printFood();
                Order.checkOrder();
                break;
            case 2:
                FrozenCustard.printFood();
                Order.checkOrder();
                break;
            case 3:
                Beer.printFood();
                Order.checkOrder();
                break;
            case 4:
                Drinks.printFood();
                Order.checkOrder();

                break;
            case 5:
                getOrderList();
                checkOrderList();

                break;
            case 6:
                Order.setOrderList();
                break;
            default:
                System.out.println("1~6번 메뉴중 선택해 주세요");
                break;
        }
        showMainMenu();
    }
//    public void showOrderList() {
//
//        for (int i = 0; i < orderList.size(); i++) {
//            System.out.println((i + 1) + ". " + Order.orderList.name[i] + "| W " + orderList.price[i] + "|  " + orderList.desc[i]);(오더리스트에 추가되어있는 값 가젹오기)
//            System.out.println("total");  // 오더리스트에 저장된 가격의 합
//        }
//    }


}
