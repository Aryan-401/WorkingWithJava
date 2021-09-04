package garg.aryan.java;

public class WorkingWithOperators {
    public static void main(String[] args) {
        int result = 3;
        System.out.println("1 + 2 is " + result);
        int originalResult = result;

        originalResult = originalResult - 1;
        result = originalResult;
        result*= 2;
        System.out.println(originalResult + "* 2 =" + " " + result);
        result = ++result + 1;
        result++;
        System.out.println(result);

        int bitmask = 0x000F;
        int val = 2;
        System.out.println(val & bitmask);

    }
}

