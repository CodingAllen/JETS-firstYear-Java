package k01;

import java.util.Scanner;

public class Kadai0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sale sale = new Sale();
        int[] no = sale.getNO();
        for(int i = 0;i < no.length; i++) {
            System.out.print("No : " + no[i] + " " + "Num -- >");
            int num = sc.nextInt();
            sale.addNum(no[i], num);
        }
        int[] sales = sale.getSales();
        for(int i = 0;i < no.length -1 ; i++) {
            for(int j = 0; j < no.length - 1 -i;j++) {
                if(sales[j] < sales[j + 1]) {
                    int tmp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tmp;

                    tmp = no[j];
                    no[j] = no[j + 1];
                    no[j + 1] = tmp;
                }
            }
        }
        for(int i = 0;i < no.length;i++) {
            System.out.println("No : " + no[i] + "\t" + sales[i]);
        }
        no = sale.getNO();
        sales = sale.getSales();

        for(int i = 0;i < no.length;i++) {
            System.out.println("No : " + no[i] + "\t" + sales[i]);
        }
        sc.close();
    }
}
