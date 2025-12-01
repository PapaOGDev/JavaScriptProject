public class ArmStrongNumberThousand {

    public static void main(String[] args) {

        for (int count = 1; count <= 1000; count++) {
            armStrong(count);
        }
    }

    public static Integer armStrong(int number) {
        int lengthOfNumber = String.valueOf(number).length();
        int newNumber = number;
        int total = 0;

        while (newNumber != 0) {
            int lastDigit = newNumber % 10;
            int cube = exponential(lastDigit, lengthOfNumber);
            total += cube;
            newNumber = newNumber / 10;
        }

        if (total == number) {
            System.out.println(number);
            return number;
        }

        return null;
    }

    public static int exponential(int firstNumber, int secondNumber) {
        int total = 1;
        for (int count = 1; count <= secondNumber; count++) {
            total *= firstNumber;
        }
        return total;
    }
}

