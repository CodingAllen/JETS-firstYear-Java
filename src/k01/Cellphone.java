package k01;

public class Cellphone {
    private String number;
    private String name;
    private int baseCharge;
    private int unitCallCharge;
    private int freeTraffic;
    private int unitComCharge;
    private int airtime;
    private double traffic;

    Cellphone(String number, String name, int baseCharge, int unitCallCharge, int freeTraffic, int unitComCharge) {
        this.number = number;
        this.name = name;
        this.baseCharge = baseCharge;
        this.unitCallCharge = unitCallCharge;
        this.freeTraffic = freeTraffic;
        this.unitComCharge = unitComCharge;
        this.airtime = 0;
        this.traffic = 0.0;
    }

    String getNumber() {
        return number;
    }

    String getName() {
        return name;
    }

    int getBaseCharge() {
        return baseCharge;
    }

    int getUnitCallCharge() {
        return unitCallCharge;
    }

    int getFreeTraffic() {
        return freeTraffic;
    }

    int getUnitComCharge() {
        return unitComCharge;
    }

    void addAritime(int airtime) {
        this.airtime += airtime;
    }

    void addTraffic(double traffic) {
        this.traffic += traffic;

    }

    int getPhoneCallFare() {
        int phoneFare;
        phoneFare = airtime * unitCallCharge;
        return phoneFare;
    }

    int getCommunicationFare() {
        int cFare;
        if (traffic > freeTraffic) {
            cFare = ((int) (traffic - freeTraffic) + 1) * unitComCharge;
        } else {
            cFare = 0;
        }
        return cFare;
    }

    void printAccount() {
        System.out.println("電話番号 : " + getNumber());
        System.out.println("名義 : " + getName());
        System.out.println("通話時間 : " + this.airtime + "分");
        System.out.println("通信量　: " + this.traffic + "GB");
        System.out.println("通話料金 : " + this.getPhoneCallFare() + "円");
        System.out.println("通信料金 : " + this.getCommunicationFare() + "円");
        int a = this.getPhoneCallFare() + this.getCommunicationFare() + getBaseCharge();

        System.out.println("請求額 : " + a + "円");
    }
}
