package k11;

import java.util.ArrayList;
import java.util.List;

public class GoodsList {
    private List<Goods> list = new ArrayList<>();

    GoodsList() {
        list.add(new Goods("A001", "T-Shirt", 4500));
        list.add(new Goods("A002", "Y-Shirt", 5200));
        list.add(new Goods("B001", "Sneaker", 3000));
        list.add(new Goods("B002", "Sandal", 1500));
        list.add(new Goods("C001", "Wallet", 7800));
        list.add(new Goods("C002", "Kerchief", 790));
    }

    public Goods get(String goodsCode) {
        int i = 0;
        while (i < list.size() && !goodsCode.equals(list.get(i).getGoodsCode())) {
            i++;
        }
        if (i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }
}
