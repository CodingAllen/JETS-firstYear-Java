package k01;

import java.util.Scanner;

public class Kadai0103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("電話番号　-->");
        String number = scanner.next();
        System.out.print("名義　-->");
        String name = scanner.next();
        System.out.print("基本料金　-->");
        int baseCharge = scanner.nextInt();
        System.out.print("１分あたりの通話料金　-->");
        int unitCallCharge = scanner.nextInt();
        System.out.print("無料通信量(GB)　-->");
        int freeTraffic = scanner.nextInt();
        System.out.print("無料部分超過の１GB当たりの通信料金　-->");
        int unitComCharge = scanner.nextInt();

        Cellphone cellphone = new Cellphone(
                number,
                name,
                baseCharge,
                unitCallCharge,
                freeTraffic,
                unitComCharge);
        System.out.println();
        System.out.println("電話番号 : " + cellphone.getNumber());
        System.out.println("名義 : " + cellphone.getName());
        System.out.println("基本料金 : " + cellphone.getBaseCharge() + "円");
        System.out.println("１分あたりの通話料金 : " + cellphone.getUnitCallCharge() + "円");
        System.out.println("無料通信量(GB) : " + cellphone.getFreeTraffic() + "GB");
        System.out.println("無料部分超過の１GB当たりの通信料金 : " + cellphone.getUnitComCharge() + "円");
        System.out.println("メニュー選択");
        System.out.print("1:通話" + "\n" + "2:通信" + "\n" + "9:終了");
        System.out.println();
        System.out.print("選択 -->");
        int differ = scanner.nextInt();
        while (differ != 9) {
            if (differ == 1) {
                System.out.print("通話時間　-->");
                int airtime = scanner.nextInt();
                cellphone.addAritime(airtime);

            } else if (differ == 2) {
                System.out.print("通信量 -->");
                double traffic = scanner.nextDouble();
                cellphone.addTraffic(traffic);
            }
            System.out.print("選択 -->");
            differ = scanner.nextInt();
        }
        cellphone.printAccount();
        scanner.close();
    }
}
