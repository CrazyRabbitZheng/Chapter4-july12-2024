import java.util.Scanner;

/**
 * This class  takes in students' marks and print the average
 * @author--Zheng Wang
 */
public class ClassAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("enter grade or enter -1 to quit");
        int grade = in.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter++;
            System.out.println("enter grade or enter -1 to quit");
            grade = in.nextInt();

        }

        if(gradeCounter != 0) {
            double average = (double)total / gradeCounter;//如果不用double cast，这里两个integer相除，小数部分cast，精确性不高。
            System.out.println("Class total is " + total);
            System.out.printf("Average is %.2f", average);
        }else {
            System.out.println("No grade in entered");
        }
    }
}
