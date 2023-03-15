package k14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String[][]> patterns = new ArrayList<>();
        patterns.add(new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", ".", "."}, {".", ".", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "."}, {".", ".", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {".", ".", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", ".", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", "#", "."}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", "#", "#"}, {".", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", "#", "#"}, {"#", ".", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", "#", "#"}, {"#", "#", "."}});
        patterns.add(new String[][]{{"#", "#", "#"}, {"#", "#", "#"}, {"#", "#", "#"}});


        int[][] nums = new int[str.length()][str.length()];

        // 记录每一行的数字对应的图案
        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i));
            nums[i][0] = patterns.get(num)[0].length;
            nums[i][1] = patterns.get(num)[1].length;
            nums[i][2] = patterns.get(num)[2].length;
        }

        // 输出第一行的所有图案
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < str.length(); j++) {
                int num = nums[j][i];
                String[][] pattern = patterns.get(Character.getNumericValue(str.charAt(j)));

                for (int k = 0; k < num; k++) {
                    System.out.print(pattern[i][k]);
                }
                // 每个图案输出后添加 1 个空格

            }
            // 每一行的所有图案输出完成后添加 1 个换行符
            System.out.println();
        }
    }
    }






