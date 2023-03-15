package k03;

import java.util.Scanner;

public class Kadai0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("辺A --->");
        double a = sc.nextDouble();
        System.out.print("辺B --->");
        double b = sc.nextDouble();
        System.out.print("辺C --->");
        double c = sc.nextDouble();
        if (a < b + c && b < a + c && c < a + b) {
            double s = (a + b + c) / 2;
            double t = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("面積 : " + t);
        } else {
            System.out.println("三角形は不成立");
        }
        sc.close();

    }
}
