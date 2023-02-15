package assignment;

import java.util.*;

public class largestElement {

    public static void main(String[] args) {
        int[] myList = {12, 34, 5, 0, 9};

        int index = 0;
        int min = myList[index];

        for (int i = 1; i < myList.length; i++) {
            if (myList[i] <= min) {
                min = myList[i];
                index = i;
            }
        }
        System.out.println("The smallest index of the array is : " + index);
    }

    }

