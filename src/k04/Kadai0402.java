package k04;

import java.util.Scanner;

public class Kadai0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kamoku[] kamoku = {new Kamoku("1023", "アルゴリズム"),
                new Kamoku("3951", "プログラミング"),
                new Kamoku("6700", "Winプログラミング"),
                new Kamoku("1159", "Webプログラミング"),
                new Kamoku("4401", "Linux"),
                new Kamoku("8211", "卒業制作")};
        System.out.print("KamokuCode or end -->");
        String svc = sc.next();
        int i = 0;
        while (!svc.equals("end")) {

            while (i < kamoku.length && !svc.equals(kamoku[i].getKamokuCode())) {
                i++;
            }
            if (i < kamoku.length) {
                System.out.println("KamokuName : " + kamoku[i].getKamokuName());
            } else {
                System.out.println("Kamoku Not Find.");
            }
            System.out.print("KamokuCode or end -->");
            svc = sc.next();
        }
        sc.close();
    }
}
