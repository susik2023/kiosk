package Kiosk;

import java.util.Scanner;

public class Beer  extends Food {

    private static String [] name = {"맥주1","맥주2","맥주3","맥주4","맥주5"};
    private static double [] price = {4.5,5.5,6.5,7.5,8.5};
    private static String [] desc = {"맥주1의 설명",
            "맥주2의 설명",
            "맥주3의 설명",
            "맥주4의 설명",
            "맥주5의 설명"};

    public Beer(String name, double price, String desc) {
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
