import java.util.Scanner;

/*Design a JAVA program to help a teacher track the exam scores of five students in a
class. The teacher wants to input the exam scores of each student and then view statistics
such as the sum of all scores and the highest score attained.*/
public class ExamScore {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        int[] examScores = new int[NUM_STUDENTS];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exam scores for each student:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter score for student" + (i + 1) + ":");
            examScores[i] = scanner.nextInt();
        }
        int sum = 0;
        int highestScore = examScores[0];
        for (int score : examScores) {
            sum += score;
            if (score > highestScore) {
                highestScore = score;
            }
        }
        System.out.println("\nExam score statistics:");
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Highest score attained: " + highestScore);
    }
}
