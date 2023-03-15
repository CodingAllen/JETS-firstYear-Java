package k13;

import java.util.Scanner;

public class Kadai1304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager um = new UserManager();
        System.out.println("1 : Login");
        System.out.println("2 : Change Password");
        System.out.println("3 : Change Access Level");
        System.out.println("4 : Add User");
        System.out.println("9 : End");

        System.out.print("Choice -->");
        int choice = sc.nextInt();

        while (choice != 9) {
            if (choice == 1) {
                System.out.print("User Id -->");
                String id = sc.next();

                System.out.print("Password -->");
                String passWord = sc.next();

                User user = new User(id, passWord, null);
                if (um.login(user) != null) {
                    System.out.println("Access Level : " + um.login(user));
                } else {
                    System.out.println("ログイン失敗");
                }
            }
            if (choice == 2) {
                System.out.print("User Id -->");
                String id = sc.next();

                System.out.print("Password(old) -->");
                String passWordold = sc.next();

                User user = new User(id, passWordold, null);

                System.out.print("Password(new) -->");
                String passWordnew = sc.next();
                boolean ret = um.update(user, passWordnew);
                if (ret) {
                    System.out.println("password Changed");
                } else {
                    System.out.println("変更失敗");
                }
            }
            if (choice == 3) {
                System.out.print("User Id -->");
                String id = sc.next();

                System.out.print("Access Level -->");
                String acclevel = sc.next();

                boolean ret = um.update(id, acclevel);
                if (ret) {
                    System.out.println("Access Level Changed");
                } else {
                    System.out.println("変更失敗");
                }
            }
            if (choice == 4) {
                System.out.print("User Id -->");
                String id = sc.next();

                System.out.print("Password -->");
                String passWord = sc.next();

                System.out.print("Access Level -->");
                String accLevel = sc.next();

                User user = new User(id, passWord, accLevel);
                if (um.add(user)) {
                    System.out.println("User Added");
                } else {
                    System.out.println("既に存在している");
                }
            }
            System.out.print("Choice -->");
            choice = sc.nextInt();
        }
        sc.close();
    }
}
