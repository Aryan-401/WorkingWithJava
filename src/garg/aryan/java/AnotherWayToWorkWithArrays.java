package garg.aryan.java;

import java.util.Arrays;

public class AnotherWayToWorkWithArrays {
    public static void main(String[] args) {
        int[] MyArray = {
          100,200,300,400,500,600,700,800,900,1000
        };
        int[] newArray = java.util.Arrays.copyOfRange(MyArray, 2,5);
        String Variable = Arrays.toString(newArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println("->"+Variable);
        System.out.println(MyArray[2] == 300);
        System.out.println(Variable.equals("Hello"));
//        java.util.Arrays.stream(newArray).map(item -> item + ' ').forEach(System.out::print);
    }
}

