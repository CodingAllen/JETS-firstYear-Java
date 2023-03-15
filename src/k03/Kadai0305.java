package k03;

import java.util.Scanner;

public class Kadai0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CSV String -->");
        String str = sc.next();
        System.out.print("Pass Score -->");
        int passScore = sc.nextInt();
        Seiseki se = new Seiseki(str);

        System.out.println("Number : " + se.getNo());
        System.out.println("Name : " + se.getName());
        System.out.println("Score : " + se.getScore());
        System.out.println("Grade : " + se.getGrade(passScore));
    }
}
