package k11;

import java.util.ArrayList;
import java.util.List;

public class CustomerList{
    private List<Customer> list = new ArrayList<>();

    public CustomerList() {
        list.add(new Customer("CU01", "Aoyama Ichiro"));
        list.add(new Customer("CU02", "Kyama Midori"));
        list.add(new Customer("CU03", "Saki Toshio"));
        list.add(new Customer("CU04", "Takeda Keisuke"));
        list.add(new Customer("CU05", "Nakayama Syo"));
    }
    public Customer get(String CustomerNo){
        int i = 0;
        while (i < list.size() && !CustomerNo.equals(list.get(i).getCustomerNo())) {
            i++;
        }
        if (i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }

}
