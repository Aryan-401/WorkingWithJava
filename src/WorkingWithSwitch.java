import java.util.Scanner;

public class WorkingWithSwitch {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Input a number");
        while (true) {
            int month = ask.nextInt();
            String monthString = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "Invalid month";
            };
            System.out.println(monthString);
        }
    }
}