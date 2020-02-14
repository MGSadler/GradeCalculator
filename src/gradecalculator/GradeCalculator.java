package gradecalculator;

import java.util.Scanner;

public class GradeCalculator {
    
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final double HOMEWORK_MAX = 80.0;
      final double QUIZ_MAX = 20.0;
      final double MIDTERM_MAX = 40.0;
      final double FINAL_MAX = 70.0;
      final double HOMEWORK_WEIGHT = 0.10; // 20%
      final double QUIZ_WEIGHT = 0.15;
      final double MIDTERM_WEIGHT = 0.30;
      final double FINAL_WEIGHT = 0.45;

      double homeworkScore;
      double quizScore;
      double midtermScore;
      double finalScore;
      double coursePercentage;

      System.out.println("Enter homework score: ");
      homeworkScore = scnr.nextDouble();
      
      System.out.println("Enter quiz score: ");
      quizScore = scnr.nextDouble();

      System.out.println("Enter midterm exam score: ");
      midtermScore = scnr.nextDouble();

      System.out.println("Enter final exam score: ");
      finalScore = scnr.nextDouble();

      coursePercentage = ((homeworkScore / HOMEWORK_MAX) * HOMEWORK_WEIGHT)
                       + ((quizScore / QUIZ_MAX) * QUIZ_WEIGHT)
                       + ((midtermScore / MIDTERM_MAX) * MIDTERM_WEIGHT)
                       + ((finalScore / FINAL_MAX) * FINAL_WEIGHT);
      
      coursePercentage = coursePercentage * 100; // Convert fraction to %

      System.out.print("Your course percentage: " + String.format("%.2f", coursePercentage));
   }
}
