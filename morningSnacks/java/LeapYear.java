public class LeapYear {
    public static void main(String[] args) {

        for (int year = 1900; year <= 2025; year++) {
            boolean isLeap =
                (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0);

            if (isLeap) {
                System.out.println(year);
            }
        }
    }
}

