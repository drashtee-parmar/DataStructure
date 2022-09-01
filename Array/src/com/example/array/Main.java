package com.example.array;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        // indices in array starts with 0 base till 6.
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}