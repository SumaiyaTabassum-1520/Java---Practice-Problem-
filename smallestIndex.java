package assignment;

public class smallestIndex {
    public static void main(String[] args) {
        int[] myList = {3, 34, 5, 7, 0};
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


