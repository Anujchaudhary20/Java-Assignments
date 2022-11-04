package com.corejava;
public class Search {

    public static void main(String[] args) {

        int[] array = {12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        int value = 19;
        int index = -1;
        boolean found = false;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
            {
                found = true;
                index = i;
                break;
            }
        }

        if(found) {
            System.out.println("Value found at index = "+ index);
        } else {
            System.out.println("Value not found!");
        }
    }
}