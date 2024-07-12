import java.util.Scanner;

/**
 * This class print a hollow square with 4 sides of asterisks
 * @author--Zheng Wang
 */
public class HollowAsteriskSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;

        while ((size < 2) | (size > 20)) {
            System.out.println("Please enter the size of the square(2 - 20): ");
            size = in.nextInt();
        }

        System.out.printf("Here you are! A hollow square of asterisks with the size of %d!%n%n", size);

        //first row of [size] *'s
        int column = 1;
        while(column <= size){
            System.out.print("* ");//there is a space after *,length of the first row(row = n) is 2n-1,
           //length of spaces in Row 2 is 2n-1-2 = 2n -3.
            //Here -2 means substruct 2 *'s from the beginning and the end
            column++;
        }
        System.out.println();

        int row = 2;
        while(row < size){
           // System.out.printf("%s %"+(size * 2-3)+"s","*","*");//width can be expressed as a expression. that expression should be surrounded by + , and surrounded by "
            System.out.printf("*%"+(size * 2 - 3)+"s*","");//the comments above explains why the width of the blank space should be size*2-3
            row++;
            System.out.println();
        }

        if(row  == size){
            int column1 = 1;
            while(column1 <= size){
                System.out.print("* ");
                column1++;
            }
        }

    }
}
