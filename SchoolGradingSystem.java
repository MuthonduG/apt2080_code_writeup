import java.util.Random;
import java.util.Scanner;

public class SchoolGradingSystem {

    public void gradeStudent(int score) {
        char grade;
        String feedback;

        if (score >= 90) {
            grade = 'A';
            feedback = "Excellent work! Keep it up!";
        } else if (score >= 80) {
            grade = 'B';
            feedback = "Great job! A little more effort and you’ll be at the top!";
        } else if (score >= 70) {
            grade = 'C';
            feedback = "Good effort! Keep practicing to improve!";
        } else if (score >= 60) {
            grade = 'D';
            feedback = "You passed, but you need to work harder.";
        } else {
            grade = 'F';
            feedback = "Failed. You need to review the material and seek help.";
        }

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + feedback);
    }

    public void randomGradeAssignment() {
        Random random = new Random();
        int randomScore = random.nextInt(101); 
        System.out.println("\nRandom student score generated.");
        gradeStudent(randomScore);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SchoolGradingSystem gradingSystem = new SchoolGradingSystem();

        System.out.print("Enter student score (0-100): ");
        int score = scanner.nextInt();
        gradingSystem.gradeStudent(score);

        gradingSystem.randomGradeAssignment();

        scanner.close();
    }
}
