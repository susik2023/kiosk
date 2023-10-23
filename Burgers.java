package Kiosk;

import java.util.Scanner;

public class Burgers extends Food {

    public static String [] name = {"ShackBurger","SmokeShack","Mushroom Burger","Cheeseburger","Hamburger"};
    private static double [] price = {4.5,5.5,6.5,7.5,8.5};
    private static String [] desc = {"토마토, 양상추, 쉑소스가 토핑된 치즈버거",
            "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
            "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
            "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
            "비프패티를 기반으로 야채가 들어간 기본버거"};

    public Burgers(String name, double price, String desc) {
        super(name, price, desc);
    }


    public static void printFood() {
        for (int i=0;i< name.length;i++)
        System.out.println((i+1)+". "+name[i]+"| W "+ price[i]+"|  "+desc[i]);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt()-1;
        System.out.print(name[choice]+ " | W");
        System.out.print(price[choice] + " |");
        System.out.print(desc[choice]);
        System.out.println();

    }

}
