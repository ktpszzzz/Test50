import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = "";

        if (score < 50) {
            grade = "E";
        } else if (score < 55) {
            grade = "D";
        } else if (score < 60) {
            grade = "D+";
        } else if (score < 65) {
            grade = "C";
        } else if (score < 70) {
            grade = "C+";
        } else if (score < 75) {
            grade = "B";
        } else if (score < 80) {
            grade = "B+";
        } else {
            grade = "A";
        }

        System.out.println("Your grade: " + grade);
    }
}