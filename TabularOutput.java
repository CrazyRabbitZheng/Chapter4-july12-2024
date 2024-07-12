/**
 * This class plays with loops
 * prints a table
 */
public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%n%n","N","10 * N","100 * N","1000 * N");
        int n = 1;
        while (n <= 10) {
            System.out.printf("%-10s%-10s%-10s%-10s%n",n,10 * n,100 * n,1000 * n);
            n++;
        }
    }
}
