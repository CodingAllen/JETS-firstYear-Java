package k04;

import java.util.Scanner;

public class Kadai0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] bankAccounts = new BankAccount[3];
        for (int i = 0; i < bankAccounts.length; i++) {

            System.out.print("Name -->");
            String name = sc.next();
            System.out.print("Money -->");
            int money = sc.nextInt();
            bankAccounts[i] = new BankAccount(name, money);
        }
        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.println(bankAccounts[i].getNumber() + "\t" + bankAccounts[i].getName() + "\t" + bankAccounts[i].getMoney());
        }
        System.out.print("Rate -->");
        double rate = sc.nextDouble();
        BankAccount.setRate(rate);
        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].addInterest();
            System.out.println(bankAccounts[i].getNumber() + "\t" + bankAccounts[i].getName() + "\t" + bankAccounts[i].getMoney());
        }
        sc.close();
    }
}
