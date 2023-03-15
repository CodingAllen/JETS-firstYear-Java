package k02;

import java.util.Scanner;

public class Kadai0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name -->");
        String name = sc.next();
        System.out.print("score -->");
        int score = sc.nextInt();

        Student s1 = new Student(name, score);
        System.out.println(s1.getNumber() + s1.getName() + "\t" + s1.getScore() + "\t" + s1.getGrade());

        System.out.print("name -->");
        name = sc.next();
        System.out.print("score -->");
        score = sc.nextInt();
        Student s2 = new Student(name, score);
        System.out.println(s2.getNumber() + s2.getName() + "\t" + s2.getScore() + "\t" + s2.getGrade());

        System.out.print("name -->");
        name = sc.next();
        System.out.print("score -->");
        score = sc.nextInt();
        Student s3 = new Student(name, score);
        System.out.println(s3.getNumber() + s3.getName() + "\t" + s3.getScore() + "\t" + s3.getGrade());

        System.out.print("name -->");
        name = sc.next();
        System.out.print("score -->");
        score = sc.nextInt();
        Student s4 = new Student(name, score);
        System.out.println(s4.getNumber() + s4.getName() + "\t" + s4.getScore() + "\t" + s4.getGrade());

        System.out.print("name -->");
        name = sc.next();
        System.out.print("score -->");
        score = sc.nextInt();
        Student s5 = new Student(name, score);
        System.out.println(s5.getNumber() + s5.getName() + "\t" + s5.getScore() + "\t" + s5.getGrade());

        System.out.println("Counter : " + Student.getCounter());
        sc.close();
    }

}
