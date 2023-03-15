package k02;

import java.util.Scanner;

public class Kadai0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("利率 -->");
        double rate = sc.nextDouble();
        System.out.print(" 口座名義 -->");
        String name = sc.next();
        System.out.print("預金額 -->");
        int money = sc.nextInt();
        BankAccount b1 = new BankAccount(name, money);

        System.out.print(" 口座名義 -->");
        name = sc.next();
        System.out.print("預金額 -->");
        money = sc.nextInt();
        BankAccount b2 = new BankAccount(name, money);

        BankAccount.setRate(rate);
        b1.addInterest();
        b2.addInterest();

        System.out.println("口座番号 : " + b1.getNumber());
        System.out.println("口座名義 : " + b1.getName());
        System.out.println("口座残高 : " + b1.getMoney());

        System.out.println();
        System.out.println("口座番号 : " + b2.getNumber());
        System.out.println("口座名義 : " + b2.getName());
        System.out.print("口座残高 : " + b2.getMoney());

        System.out.println();
        System.out.print("利率 -->");
        rate = sc.nextDouble();
        BankAccount.setRate(rate);
        b1.addInterest();
        b2.addInterest();

        System.out.println("口座番号 : " + b1.getNumber());
        System.out.println("口座名義 : " + b1.getName());
        System.out.print("口座残高 : " + b1.getMoney());
        b1.addInterest();
        System.out.println();
        System.out.println("口座番号 : " + b2.getNumber());
        System.out.println("口座名義 : " + b2.getName());
        System.out.print("口座残高 : " + b2.getMoney());
        b2.addInterest();
    }
}
