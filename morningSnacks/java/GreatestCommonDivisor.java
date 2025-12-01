import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int count = 1;
        Integer largestCommonDivisor = null;

        while (count <= firstNumber / 2 || count <= secondNumber / 2) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                largestCommonDivisor = count;
            }
            count++;
        }

        System.out.println(largestCommonDivisor);
    }
}

