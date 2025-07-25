package Task2_StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        // Loop to take marks input
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Validate marks
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / numSubjects;
        char grade;

        // Grade logic
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else if (average >= 50) grade = 'E';
        else grade = 'F';

        // Output
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
