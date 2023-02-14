package problemstring;

import java.util.*;

public class individualCharString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        //taking string input from user
        String str = input.nextLine();

        System.out.print("Individual charechters are : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
