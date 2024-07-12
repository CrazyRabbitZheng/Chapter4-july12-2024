import java.util.Scanner;

/**
 * This class  takes in students' marks and print the average
 * @author--Zheng Wang
 */
public class ClassAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10){
            System.out.print("Enter grade of " + gradeCounter + ": ");
            int grade = in.nextInt();
            total += grade;
            gradeCounter++;
        }

        int average = total / 10;
        System.out.println("Class total grade is " + total);
        System.out.println("Class average is " + average);
    }
}
