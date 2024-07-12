import java.util.Scanner;

/**
 * This class takes in a 5-digit integer and check if it is palindrome
 * 回文
 * @author--Zheng Wang
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a five digit integer: ");
        int fiveDigits = in.nextInt();

        while((fiveDigits / 10000 <= 0) || (fiveDigits / 10000 > 9)){
            System.out.print("Please enter a five digit integer: ");
            fiveDigits = in.nextInt();
        }

        int digit10000 = fiveDigits / 10000;
        int digit1000 = fiveDigits / 1000 % 10;
        int digit100 = fiveDigits / 100 % 10;
        int digit10 = fiveDigits / 10 % 10;
        int digit1 = fiveDigits  % 10;

        System.out.printf("%nThe 10000's digit is %4d%n", digit10000);//set width here to make 5 digits vertically line up
        System.out.printf("The 1000's digit is %5d%n", digit1000);
        System.out.printf("The 100's digit is %6d%n", digit100);
        System.out.printf("The 10's digit is %7d%n", digit10);
        System.out.printf("The 1's digit is %8d%n%n", digit1);

        if((digit10000 == digit1) && (digit1000 == digit10)){

            System.out.printf("%d is a palindrome", fiveDigits);
        }else {
            System.out.printf("%d is not a palindrome%n", fiveDigits);
        }
    }
}
