import java.util.Scanner;

/**
 * This class takes in the item quantity sold by 10 staff,
 * and display the Winner who sold the most units.
 */
public class SalesContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mostUnitsSold = 0;

        int staffID = 1;
        int winnerID = 0;

        while (staffID <= 10) {
            System.out.printf("Enter units sold by Staff %d:\n", staffID);
            int unitsSold = in.nextInt();
            if(unitsSold > mostUnitsSold){
                mostUnitsSold = unitsSold;
                winnerID = staffID;
            }

            staffID++;
        }
        System.out.printf("Winner ID: %d\nSold %d units!", winnerID, mostUnitsSold);
    }
}
