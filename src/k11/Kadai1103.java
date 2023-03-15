package k11;

import java.util.ArrayList;

import java.util.List;

public class Kadai1103 {
    public static void main(String[] args) {

        GoodsList goodsList = new GoodsList();
        CustomerList customerList = new CustomerList();

        String[] konyu = {
                "CU01,B001,2",
                "CU01,C001,1",
                "CU03,A001,3",
                "CU03,A002,2",
                "CU03,B002,2",
                "CU04,C001,1",
                "CU04,C002,5",
                "CU05,B001,6"
        };
        List<String> listCustomerCode = new ArrayList<>();
        List<String> listGoodscode = new ArrayList<>();
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < konyu.length; i++) {
            String[] str = konyu[i].split(",");
            listCustomerCode.add(str[0]);
            listGoodscode.add(str[1]);
            listNum.add(Integer.parseInt(str[2]));
        }
        int[] total1 = new int[konyu.length];
        for (int j = 0; j < konyu.length; j++) {
            if (j == 0 || j == 2 || j == 5 || j == 7) {
                System.out.println(customerList.get(listCustomerCode.get(j)).getCustomerNo() + ":" +
                        customerList.get(listCustomerCode.get(j)).getCustomerName());

            }
            System.out.println(listGoodscode.get(j) + "\t" + goodsList.get(listGoodscode.get(j)).getGoodsName()
                    + "\t" + goodsList.get(listGoodscode.get(j)).getPrice() + " * " + listNum.get(j) + " = " +
                    goodsList.get(listGoodscode.get(j)).getPrice() * listNum.get(j));
            total1[j] = goodsList.get(listGoodscode.get(j)).getPrice() * listNum.get(j);

            if (j == 1 || j == 6) {
                System.out.println("                    " + "Total:" + (total1[j - 1] + total1[j]));
            }
            if (j == 4) {
                System.out.println("                    " + "Total:" + (total1[j] + total1[j - 1] + total1[j - 2]));
            }
            if (j == 7) {
                System.out.println("                    " + "Total:" + total1[j]);
            }

        }


    }
}
