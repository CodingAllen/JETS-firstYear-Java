package k07;

import java.util.Scanner;

public class Kadai0701 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scanner = new Scanner(System.in);
        Syain[] syains = new Syain[3];
        for(int i = 0; i < syains.length; i++) {
            System.out.print("1:Eigyo 2:Hanbai -->");
            int choose = scanner.nextInt();
            System.out.println("Code -->");
            String codeString = scanner.next();
            System.out.println("Name -->");
            String nameString = scanner.next();
            if(choose == 1) {
                syains[i] = new Eigyo(codeString, nameString);
            }else if(choose == 2) {
                syains[i] = new Hanbai(codeString, nameString);
            }

        }
        for(int i = 0; i < syains.length; i++) {
            System.out.println();
            System.out.println("Code : " + syains[i].getCodeString());
            System.out.println("Name : " + syains[i].getNameString());
            syains[i].work();
        }
        scanner.close();
    }

}
