import java.util.Scanner;

/**
 * This class takes in 10 results - pass or fail
 * count total numbers of students pass or fail
 * if more than 8 students passed, print "Bouns"
 */
public class Analysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int passCounter = 0;
        int failCounter = 0;
        int studentCounter = 1;

        while(studentCounter <= 10){
            System.out.printf("Enter the %dth student result (1 means pass and 2 means fail):%n", studentCounter);
            int result = in.nextInt();

            if(result == 1){
                passCounter++;
            }else{
                failCounter++;
            }
            studentCounter++;
        }

        System.out.printf("%d students passed%n", passCounter);
        System.out.printf("%d students failed%n", failCounter);

        if(passCounter > 8){
            System.out.println("Instructor gets bouns!");
        }
    }
}
