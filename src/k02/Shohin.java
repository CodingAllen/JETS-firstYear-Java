package k02;

public class Shohin {
    private String name;
    private int price;

    private static double tax;

    Shohin(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    int getPriceIncludeTax() {
        int priceTax = (int) (price + price * tax);
        return priceTax;
    }

    static void setTax(double tax) {
        Shohin.tax = tax;
    }

    static double getTax() {
        return tax;
    }
}
