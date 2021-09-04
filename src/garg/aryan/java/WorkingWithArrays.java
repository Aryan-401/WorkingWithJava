package garg.aryan.java;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] AnArray;
        AnArray = new String[5];
        AnArray[0] = String.valueOf('1');
        AnArray[1] = String.valueOf('2');
        AnArray[2] = String.valueOf('3');
        AnArray[4] = String.valueOf('5');
        System.out.println(AnArray[0] + AnArray[1] + AnArray[2] + AnArray[3] + AnArray[4]);
    }
}
