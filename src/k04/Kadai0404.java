package k04;

import java.util.Scanner;

public class Kadai0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Seiseki[] seisekis = new Seiseki[10];
        for (int i = 0; i < seisekis.length; i++) {
            System.out.print("Number -->");
            String number = sc.next();
            System.out.print("Name -->");
            String name = sc.next();
            System.out.print("Score -->");
            int score = sc.nextInt();
            seisekis[i] = new Seiseki(number, name, score);
        }
        Seiseki tmp;
        for (int i = 0; i < seisekis.length - 1; i++) {
            for (int j = 0; j < seisekis.length - 1 - i; j++) {
                if (seisekis[j].getScore() < seisekis[j + 1].getScore()) {
                    tmp = seisekis[j];
                    seisekis[j] = seisekis[j + 1];
                    seisekis[j + 1] = tmp;
                } else if (seisekis[j].getScore() == seisekis[j + 1].getScore()) {
                    int result = seisekis[j].getNumber().compareTo(seisekis[j + 1].getNumber());
                    if (result > 0) {
                        tmp = seisekis[j];
                        seisekis[j] = seisekis[j + 1];
                        seisekis[j + 1] = tmp;
                    }
                }

            }
        }
        for (int i = 0; i < seisekis.length; i++) {
            System.out.println(seisekis[i].getNumber() + "\t" + seisekis[i].getName() + "\t" + seisekis[i].getScore());
        }
        sc.close();
    }

}
