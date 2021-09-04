package garg.aryan.java;
import java.util.Scanner;
public class BasicTesting {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("How old are you?");
        String scanned = scannerObject.next();
        int integer = Integer.parseInt(scanned);
        System.out.println(scanned);
    }

    }

