import java.util.Scanner;

/**
 * A salesman's salary is the base salary plus 9% of the gross sales
 * base salary is $200 per week
 */
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0;
        double weekSalary = 200;
        double totalSalary = 200;

        System.out.println("\nEnter the total price of a item sold:  (Enter -1 to quit)");
        double sold = input.nextDouble();

        while (sold != -1) {
            totalSales += sold;

            System.out.println("\nEnter the total price of a item sold:  Enter -1 to quit");
            sold = input.nextDouble();
        }

        if(totalSales > 0) {
            totalSalary = weekSalary + totalSales * 0.09;
        }else{
            totalSalary = weekSalary;
        }

        System.out.printf("This week you help the company earn $%.2f%n", totalSales);
        System.out.printf("Your total salary for this week is: $%.2f\n", totalSalary);
    }
}
