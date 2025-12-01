import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int factorial = 1;

        if (number < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else if (number == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            for (int count = 1; count <= number; count++) {
                factorial *= count;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}

