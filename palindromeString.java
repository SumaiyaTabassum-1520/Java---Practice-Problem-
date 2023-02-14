package problemstring;

import java.util.*;

public class palindromeString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        if (str.toLowerCase().equals(reverseStr(str).toLowerCase())) {
            System.out.println(reverseStr(str) + " " + " is a Palindrome String.");
        } else {
            System.out.println(reverseStr(str) + " " + " is not a Palindrome String.");
        }

    }

    static String reverseStr(String str) {

        String r = "";
        for (int i = str.length(); i > 0; i--) //execute until condition i>0 becomes false  
        {
            r = r + (str.charAt(i - 1));
        }
        return r;
    }

}
