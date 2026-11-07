
import java.util.Scanner;

public class Studentgradecalculator {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("===== STUDENT GRADE CALCULATOR =====");
            int subjects;
            do {
                System.out.print("Enter the number of subjects: ");
                subjects = sc.nextInt();
                if (subjects <= 0) {
                    System.out.println("Number of subjects must be greater than 0.");
                }
            }
             while (subjects <= 0);

            
            int totalMarks = 0;
            
            for (int i = 1; i <= subjects; i++) {
                
                System.out.print("Enter marks for Subject " + i + " (out of 100): ");
                int marks = sc.nextInt();
                
                while (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    System.out.print("Enter marks again: ");
                    marks = sc.nextInt();
                }
                
                totalMarks += marks;
            }
            
            double average = (double) totalMarks / subjects;
            
            char grade;
            
            if (average >= 85) {
                grade = 'A';
            }
            else if (average >= 70) {
                grade = 'B';
            }
            else if (average >= 55) {
                grade = 'C';
            }
            else if (average >= 40) {
                grade = 'D';
            }
            else {
                grade = 'F';
            }
            
            System.out.println("\n===== RESULT =====");
            System.out.println("Total Marks: " + totalMarks + " / " + (subjects * 100));
            System.out.printf("Average Percentage: %.2f%%\n", average);
            System.out.println("Grade: " + grade);
        }
    }
}