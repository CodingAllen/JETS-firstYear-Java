package k03;

import java.util.Scanner;

public class Kadai0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列 -->");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("現在の文字列 : " + sb);

        System.out.print("削除する文字列 -->");
        String str1 = sc.next();
        int len1 = str.length();
        int idx = str.indexOf(str1);

        sb.delete(idx, idx + len1);
        System.out.println("現在の文字列 : " + sb);
        System.out.println("追加する文字列 -->");
        String str2 = sc.next();
        int len2 = sb.length();
        sb.insert(len2, str2);
        System.out.println("現在の文字列 : " + sb);
        System.out.print("変更する文字列 -->");
        String str3 = sc.next();
        int len3 = str3.length();
        int idx2 = sb.indexOf(str3);
        int idx3 = idx2 + len3;
        System.out.print("新しい文字列 -->");
        String str4 = sc.next();
        sb.replace(idx2,idx3,str4);
        System.out.println("現在の文字列 : " + sb);
        int l = sb.length();
        System.out.println("Length : " + l);
        sc.close();
    }
}
