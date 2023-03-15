package k01;

import java.util.Scanner;

public class Kadai0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no -->");
        String no = sc.next();
        System.out.print("name -->");
        String name = sc.next();
        System.out.print("title -->");
        String title = sc.next();
        System.out.print("year -->");
        int year = sc.nextInt();
        System.out.print("month -->");
        int month = sc.nextInt();
        System.out.print("day -->");
        int day = sc.nextInt();
        System.out.println();

        Kashidashi k = new Kashidashi(no,name,title,year,month,day);
        System.out.println("No : " + no);
        System.out.println("Name : " + name);
        System.out.println("Title : " + title);
        System.out.println("Date : " + k.getKashidashiDate());
        System.out.println();

        System.out.print("Henkyaku? (true: Yes  false :No) -->");
        boolean henkyaku = sc.nextBoolean();
        k.setHenkyaku(henkyaku);
        k.printKashidashi();
        sc.close();
    }
}
