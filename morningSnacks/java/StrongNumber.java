import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;
        int secondFactorial = 0;
        int newNumber = number;

        while (newNumber != 0) {
            int lastDigit = newNumber % 10;
            for (int count = 1; count <= lastDigit; count++) {
                factorial *= count;
            }
            newNumber = newNumber / 10;
            secondFactorial += factorial;
            factorial = 1;
        }

        if (number == secondFactorial) {
            System.out.println("Its a strong number");
        }
    }
}

