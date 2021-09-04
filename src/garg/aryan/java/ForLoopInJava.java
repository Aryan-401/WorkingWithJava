package garg.aryan.java;

public class ForLoopInJava {
    public static void main(String[] args) {
        int[] numberArray = {
                10,20,30,40,50,60,70,80,90,100
        };
        for (int i = 0; i <= 11; i++){  //Counting in a for loop using variable
            System.out.println("Count: " + i);
        }
        for (int i=0; i <= numberArray.length - 1; i++){
            System.out.println(i + " -> " + numberArray[i]);
        }

    }
}
