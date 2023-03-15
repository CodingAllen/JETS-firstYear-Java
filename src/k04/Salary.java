package k04;

public class Salary {
    private String number;
    private String name;
    private int academic;
    private int exYear;
    private int overTime;
    private static int[] baseSalaryTable = {231000, 212000, 187000, 165000};
    private static int baseOverTimePay = 1200;
    Salary(String number,String name,int academic,int exYear,int overTime){
        this.number = number;
        this.name = name;
        this.academic = academic;
        this.exYear = exYear;
        this.overTime = overTime;

    }
    String getNumber(){
        return number;
    }
    String getName(){
        return name;
    }

    int getExYear(){
        return exYear;
    }
    int getOverTime(){
        return overTime;
    }
    static int getBaseSalary(int academic){

        return baseSalaryTable[academic];

    }

    int getBaseSalary(){
        int baseSalary;
        baseSalary = (int)Math.round(Salary.getBaseSalary(academic) + Salary.getBaseSalary(academic) * 0.02 * getExYear());
        return baseSalary;

    }
    static int getBaseOverTimePay(){
        return baseOverTimePay;
    }
    void printPaySlip(){

        System.out.println("Number : " + getNumber());
        System.out.println("Name : " + getName());
        System.out.println("BaseSalary : " + "¥" + getBaseSalary());
        System.out.println("OverTimePay : " + "¥" + (getOverTime() * getBaseOverTimePay()));
        System.out.println("(OverTime : " + getOverTime() + "H," + "BaseOverTimePay : " + "¥" + getBaseOverTimePay() + ")");
        System.out.println("Total : " + "¥" +  (getBaseSalary() + (getBaseOverTimePay() * getOverTime())));
    }
}
