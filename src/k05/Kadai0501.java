package k05;

import java.util.Scanner;

public class Kadai0501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID -->");
        String id = sc.next();
        System.out.print("Name -->");
        String name = sc.next();
        Engineer engineer = new Engineer(id, name);
        System.out.print("ID -->");
        id = sc.next();
        System.out.print("Name -->");
        name = sc.next();
        System.out.print("Project Name -->");
        String projectName = sc.next();
        Engineer engineer1 = new Engineer(id, name,projectName);
        engineer.printEnineer();
        engineer1.printEnineer();
        System.out.print("Aoyama's New Projct Name -->");
        String newName = sc.next();
        engineer.setProjectName(newName);
        engineer.printEnineer();
        sc.close();
    }
}
