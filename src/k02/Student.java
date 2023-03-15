package k02;

public class Student {
    private String number;
    private String name;
    private int score;
    private static int counter = 101;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.number = "22JN0" + counter;
        counter++;
    }

    String getNumber() {
        return number;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    String getGrade() {
        String grade;
        if (score >= 90) {
            grade = "S";
        } else if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    static int getCounter() {
        return counter;
    }
}
