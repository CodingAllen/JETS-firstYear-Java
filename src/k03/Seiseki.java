package k03;

public class Seiseki {
    private String no;
    private String name;
    private double score;

    Seiseki(String csvStr) {
        String[] s = csvStr.split(",");
        this.no = s[0];
        this.name = s[1];
        int sum = 0;
        int count = 0;
        for (int i = 2; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
            count++;
        }
        this.score = (double)sum / count;
    }

    String getNo() {
        return no;
    }

    String getName() {
        return name;
    }

    Double getScore() {
        return score;
    }

    String getGrade(int passScore) {
        String grade;
        if (score >= passScore) {
            grade = "合格";
        } else {
            grade = "不合格";
        }
        return grade;
    }
}
