import java.util.Scanner;

/**
 * This class takes in 10 integers and prints 2 largest numbers
 */
public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstLargest = 0;
        int secondLargest = 0;

        int counter = 1;
        while (counter <= 10) {
            System.out.printf("Enter the %dth number: ", counter);
            int number = in.nextInt();
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            }else {
                if(number > secondLargest) {
                    secondLargest = number;
                }
            }
            counter++;
        }

            System.out.printf("The largest number is: %d%n", firstLargest);
            System.out.printf("The second largest number is: %d%n", secondLargest);

    }
}
