import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();
        int newNumber = firstNumber;
        int count = 2;
        int sumOfNumber = 1;

        while (newNumber != count) {
            if (newNumber % count == 0) {
                sumOfNumber += count;
                System.out.println(newNumber);
            }
            count++;
        }

        if (sumOfNumber == firstNumber) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("This number is not a perfect number");
        }
    }
}

