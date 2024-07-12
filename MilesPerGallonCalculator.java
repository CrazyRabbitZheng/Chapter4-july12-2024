import java.util.Scanner;

/**
 * This class gets inputs of miles and gallons from trips user recorded.
 * display miles per gallon
 */
public class MilesPerGallonCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter miles travelled or enter -1 to exit: ");
        int miles = in.nextInt();

        while (miles != -1) {
            System.out.println("\nEnter gas used: ");
            int gas = in.nextInt();

            if (miles > 0 && gas > 0) {
                System.out.printf("%nMiles per gallon: %.2f\n", (double)miles / gas);
            }
            System.out.println("\nEnter miles travelled or enter -1 to exit: ");
            miles = in.nextInt();
        }
    }
}
