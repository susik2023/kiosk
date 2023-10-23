package Kiosk;

import java.util.Scanner;

public class Drinks  extends Food {

    private static String [] name = {"음료1","음료2","음료3","음료4","음료5"};
    private static double [] price = {4.5,5.5,6.5,7.5,8.5};
    private static String [] desc = {"음료1의 설명",
            "음료2의 설명",
            "음료3의 설명",
            "음료4의 설명",
            "음료5의 설명"};

    public Drinks(String name, double price, String desc) {
        super(name, price, desc);
    }


    public static void printFood() {
        for (int i=0;i< name.length;i++)
            System.out.println((i+1)+". "+name[i]+" | W "+ price[i]+" |  "+ desc[i]);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt()-1;
        System.out.print(name[choice]+ " | W");
        System.out.print(price[choice] + " |");
        System.out.print(desc[choice]);
        System.out.println();
        System.out.println("위 메뉴를 추가하시겠습니까?");

    }
}
