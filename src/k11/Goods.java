package k11;

public class Goods {
    private String goodsCode;
    private String goodsName;
    private int price;

    public Goods(String goodsCode, String goodsName, int price) {
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.price = price;
    }
    public Goods(String goodsCode){
        this.goodsCode = goodsCode;
    }


    public String getGoodsCode() {
        return goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public int getPrice() {
        return price;
    }
}
