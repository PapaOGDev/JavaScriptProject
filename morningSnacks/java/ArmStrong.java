import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        int lengthOfNumber = number.length();
        int newNumber = Integer.parseInt(number);
        int total = 0;

        while (newNumber != 0) {
            int lastDigit = newNumber % 10;
            int cube = exponential(lastDigit, lengthOfNumber);
            total += cube;
            newNumber = newNumber / 10;
            System.out.println(total);
        }

        if (total == Integer.parseInt(number)) {
            System.out.println("it is an armstrong number");
        } else {
            System.out.println("it is not an armstrong number");
        }
    }

    public static int exponential(int firstNumber, int secondNumber) {
        int total = 1;
        for (int count = 1; count <= secondNumber; count++) {
            total *= firstNumber;
        }
        return total;
    }
}

