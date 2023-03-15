package k03;

import java.util.Scanner;

public class Kadai0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num1 -->");
        int num1 = sc.nextInt();
        System.out.print("Num2 -->");
        int num2 = sc.nextInt();
        System.out.print("Command(tasu/hiku/kakeru/waru/end) -->");
        String script = sc.next();

        while ("end".equals(script) != true) {

            if ("tasu".equals(script)) {
                System.out.println("Result : " + (num1 + num2));

            } else if ("hiku".equals(script)) {
                System.out.println("Result : " + (num1 - num2));

            } else if ("kakeru".equals(script)) {
                System.out.println("Result : " + (num1 * num2));

            } else if ("waru".equals(script)) {

                System.out.println("Result : " + (num1 / num2));

            } else {
                System.out.println("Command Error");
            }
            System.out.print("Command(tasu/hiku/kakeru/waru/end) -->");
            script = sc.next();

        }
        sc.close();
    }
}
