package k04;

public class Seiseki {
    private String number;
    private String name;
    private int score;
    Seiseki(String number,String name,int score){
        this.number = number;
        this.name = name;
        this.score = score;
    }
    String getNumber(){
        return number;
    }
    String getName(){
        return name;
    }
    int getScore(){
        return score;
    }

}
