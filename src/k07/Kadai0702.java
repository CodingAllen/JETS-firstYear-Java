package k07;

import java.util.Scanner;

public class Kadai0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure[] figures = new Figure[3];
        for (int i = 0; i < figures.length; i++) {
            System.out.print("1:Circle 2:Rectangle 3:Triangle -->");
            int choose = scanner.nextInt();
            if(choose == 1) {
                System.out.print("Radies -->");
                double radius = scanner.nextDouble();
                figures[i] = new Circle(radius);
            }else if (choose == 2) {
                System.out.print("Side1 -->");
                double side1 = scanner.nextDouble();
                System.out.print("Side2 -->");
                double side2 = scanner.nextDouble();
                figures[i] = new Rectangle(side1, side2);
            }else if (choose == 3) {
                System.out.print("Boottom -->");
                double bottom = scanner.nextDouble();
                System.out.print("Height -->");
                double height = scanner.nextDouble();
                figures[i] = new Triangle(bottom, height);
            }
        }
        System.out.println();
        for(int i = 0; i < figures.length; i++) {
            System.out.println("Area : " + figures[i].getArea());
        }
        scanner.close();

    }

}
