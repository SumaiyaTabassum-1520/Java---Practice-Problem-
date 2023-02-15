package assignment;

public class shiftingElement {

    public static void main(String[] args) {

        int[] array = new int[]{12, 34, 5, 7, 9};
        int[] arr = new int[5];
        int i;
        System.out.print("Array Elements are : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        
        System.out.print("The shifting elements of array are : ");
        for (i = 0; i < array.length; i++) {
            arr[i] = array[array.length - i - 1];
            System.out.print(arr[i] + " ");
        }
    }

}
