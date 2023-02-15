package assignment;
import java.util.*;
public class randomSuffling {

    public static void main(String[] args) {

        int[] array = new int[]{12, 34, 5, 7, 9};

        System.out.print("before Suffling ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.print("after Suffling ");
        for (int i = 0; i < array.length; i++) {
            int rand = new Random().nextInt(array.length);

            int temp = array[i];
            array[i] = array[rand];
            array[rand] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
