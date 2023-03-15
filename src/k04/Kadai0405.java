package k04;

import java.util.Scanner;

public class Kadai0405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary[] salary = new Salary[3];
        for(int i = 0; i < salary.length; i++){
            System.out.print("Number -->");
            String number = sc.next();
            System.out.print("Name -->");
            String name = sc.next();
            System.out.print("Academic -->");
            int academic = sc.nextInt();
            System.out.print("ExYear -->");
            int year = sc.nextInt();
            System.out.print("OverTime -->");
            int overTime = sc.nextInt();
            salary[i] = new Salary(number,name,academic,year,overTime);

        }
        for(int i = 0; i < salary.length;i++){
            System.out.println("給与明細");
            salary[i].printPaySlip();
        }
        sc.close();
    }
}
