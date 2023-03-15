package k03;

import java.util.Random;

public class Kadai0304 {
    public static void main(String[] args) {

        int[] arry = new int[5];
        for (int i = 0; i < arry.length; i++) {
            Random random = new Random();
            arry[i] = random.nextInt(100);
        }
        for (int k : arry) {
            System.out.println(k);
        }
        int tmp;
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {
                    tmp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = tmp;
                }
            }
        }
        for (int k : arry) {
            if (k % 4 == 0) {
                System.out.println(k + ":" + "偶数" + "(4の倍数)" + "非素数");
            }
            if (k % 2 == 0 && k % 4 != 0) {
                System.out.println(k + ":" + "偶数" + "非素数");
            }
            if (k % 2 != 0) {
                boolean isPrime = k != 1;
                for (int j = 2; j < k / 2; j++) {
                    if (k % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(k +":" + "奇数" + "素数");
                } else {
                    System.out.println(k + ":" +  "奇数" + "非素数");
                }
            }

        }

    }
}
