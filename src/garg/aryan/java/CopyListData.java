package garg.aryan.java;

public class CopyListData
{
    public static void main(String[] args) {
        String[] FirstArray = {
                "This is a test", "Even this is a test", "WOW even this is a test", "GUYS! This is a test too",
                "No way!"
        };
        String[] NewArray = new String[2];
        System.arraycopy(FirstArray, 1, NewArray, 0, 2);
        for (String item : NewArray) {
          System.out.println(item);
        }
    }
}
