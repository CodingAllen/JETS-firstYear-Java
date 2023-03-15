package k01;

public class Kashidashi {
    private String no;
    private String name;
    private String title;
    private int year;
    private int month;
    private int day;
    private boolean henkyaku;

    Kashidashi(String no, String name, String title, int year, int month, int day) {
        this.no = no;
        this.name = name;
        this.title = title;
        this.year = year;
        this.month = month;
        this.day = day;
        this.henkyaku = false;
    }

    String getNo() {
        return no;
    }

    String getName() {
        return name;
    }

    String getTitle() {
        return title;
    }

    public void setHenkyaku(boolean henkyaku) {
        this.henkyaku = henkyaku;
    }

    String getKashidashiDate() {
        String getDate;
        getDate = year + "/" + month + "/" + day;
        return getDate;
    }

    void printKashidashi() {
        System.out.print(getNo() + "\t" + getName() + "\t" + getTitle() + "\t" + getKashidashiDate() + "\t");
        if (this.henkyaku = true) {
            System.out.print("返却済み");
        } else {
            System.out.print("貸出中");
        }
    }
}
