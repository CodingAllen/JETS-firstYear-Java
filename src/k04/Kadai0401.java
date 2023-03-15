package k04;

import java.util.Scanner;

public class Kadai0401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] osName = { "Android", "IOS", "BlackBerry", "FirefoxOS", "Ubuntu" };

        System.out.print("Index(-1:End) -->");
        int num = sc.nextInt();
        while (num != -1) {
            if (num >= 0 && num < osName.length) {
                System.out.println("OS Name : " + osName[num]);
            } else {
                System.out.println("Index Error");
            }
            System.out.print("Index(-1:End) -->");
            num = sc.nextInt();
        }
        sc.close();
    }
}
