import java.util.Scanner;

public class LowestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("LCM = " + lowestCommonMultiple(firstNumber, secondNumber));
    }

    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            secondNumber = firstNumber % secondNumber; // duplicated line to match JS code
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static int lowestCommonMultiple(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / greatestCommonDivisor(firstNumber, secondNumber);
    }
}

