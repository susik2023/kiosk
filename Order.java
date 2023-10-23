package Kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Order extends Food{

    public static ArrayList<Food> orderList = new ArrayList<Food>();
    public static String name;
    public static double price;
    public static String desc;
    private static int waiting = 0;
    public static int getWaiting(){
        return waiting;
    }
    public  void increasewaiting(){
        waiting = waiting +1;
    }


    public Order() {
        super(name, price, desc);
    }
    public void order(Food food){
      //  this.orderList.add(String name,Double price String);// 어케 추가하지 오더리스트에
    }
    public static void setOrderList(){
        System.out.println("장바구니의 주문을 취소하시겠습니까?");
        orderList.clear();
    }


    public static void totalOrderPrice(){
        double total = 0;
        for (int i=0;i<orderList.size();i++)
            System.out.println("장바구니 안의 가격의 총합" + orderList.get(i).getPrice());

    }
    public static void checkOrder(){
        System.out.println("위 메뉴를 추가하시겠습니까?");
        System.out.println("1.확인           2.취소 ");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        if (select==1){
          //  Food,name.order(Food food);//printFood에서 선택한 대상을어떻게 객체를 생성해서 던지는지 모르겠다. 여기서 오더리스트에 추가하려고했음
            System.out.println("장바구니에 추가되었습니다.");
        }else{
            System.out.println("취소되었습니다.");
        }

    }
    public void getOrderList(){
        for(int i =0;i< Order.orderList.size();i++){
            System.out.println(Order.orderList.get(i));
            totalOrderPrice();


        }
    }
    public void completOrder() {
        System.out.println("주문이 완료되었습니다.");
        System.out.println("대기 번호는 " + getWaiting() + " 번입니다.");
        increasewaiting();
        orderList.clear();
    }
    public void checkOrderList(){
        System.out.println("1.주문하기      2.취소하기");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice ==1){
            completOrder();
        }else{
            getOrderList();
        }
    }

}
