package garg.aryan.java;

import java.util.Scanner;

public class WorkingWithWorkFlow {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Input a number");
        int num = ask.nextInt();
        int result = num + 5;
        if (result == 5) {
        System.out.println("Number plus 5 is still 5");

        }
        else {
            System.err.println("Number plus five is not five");
        }
    }
}
