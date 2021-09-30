import java.util.Scanner;
/**
 * Takes input from the user and produces several mathematical statements from that.
 *
 * @author Kevin Lo
 * @version 2020-09-16
 * 
 */
public class InputAndArithmetic
{
    public static void main(String[] args)
    {
        int firstInt;
        int secondInt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        firstInt = scanner.nextInt();
        System.out.print("The first integer is ");
        System.out.print(firstInt);
        System.out.println(".");
        System.out.print("Enter a second integer: ");
        secondInt = scanner.nextInt();
        System.out.print("The second integer is ");
        System.out.print(secondInt);
        System.out.println(".");
        System.out.print("The product of the two integers is ");
        System.out.print(firstInt * secondInt);
        System.out.println(".");
        System.out.print("The double quotient of the first integer divided by the second integer is ");
        System.out.print(((double) firstInt / secondInt));
        System.out.println(".");
        System.out.print("The integer quotient of the first integer divided by the second integer is ");
        System.out.print(firstInt / secondInt);
        System.out.println(".");
        System.out.print("The remainder of the first integer divided by the second integer is ");
        System.out.print(firstInt % secondInt);
        System.out.println(".");

    }
}
