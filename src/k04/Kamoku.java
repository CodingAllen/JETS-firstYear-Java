package k04;

public class Kamoku {
    private String kamokuCode;
    private String kamokuName;
    Kamoku(String kamokuCode,String kamokuName){
        this.kamokuCode = kamokuCode;
        this.kamokuName = kamokuName;
    }
    String getKamokuCode(){
        return kamokuCode;
    }
    String getKamokuName(){
        return kamokuName;
    }
}
