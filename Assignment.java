package assignment;

public class Assignment {

    public static void main(String[] args) {
        
        int[] mylist = {12, 34, 5, 0, 9};
        int total = 0;
        for (int i = 0; i < mylist.length; i++) {
            total = total + mylist[i];

        }
        System.out.println("The sum of array is : " +total);
    }
}
