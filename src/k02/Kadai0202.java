package k02;

import java.util.Scanner;

public class Kadai0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("消費税率 -->");
        double tax = sc.nextDouble();

        System.out.print("商品名 -->");
        String name = sc.next();
        System.out.print("税抜き価格 -->");
        int price = sc.nextInt();
        Shohin s1 = new Shohin(name, price);

        System.out.print("商品名 -->");
        name = sc.next();
        System.out.print("税抜き価格 -->");
        price = sc.nextInt();
        Shohin s2 = new Shohin(name, price);
        Shohin.setTax(tax);
        System.out.println("商品名 : " + s1.getName());

        System.out.println("税抜き価格 : " + s1.getPrice());
        System.out.println("税込価格 : " + s1.getPriceIncludeTax());
        System.out.println("商品名 : " + s2.getName());
        System.out.println();
        System.out.println("税抜き価格 : " + s2.getPrice());
        System.out.println("税込価格 : " + s2.getPriceIncludeTax());

        System.out.print("消費税率(現在" + Shohin.getTax() + ")" + " -->");
        double tax2 = sc.nextDouble();
        Shohin.setTax(tax2);
        System.out.println("商品名 : " + s1.getName());

        System.out.println("税抜き価格 : " + s1.getPrice());
        System.out.println("税込価格 : " + s1.getPriceIncludeTax());
        System.out.println("商品名 : " + s2.getName());
        System.out.println();
        System.out.println("税抜き価格 : " + s2.getPrice());
        System.out.println("税込価格 : " + s2.getPriceIncludeTax());
        sc.close();
    }

}
