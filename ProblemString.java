package problemstring;

import java.util.*;

public class ProblemString {

    public static void main(String[] args) {

       //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();//
        System.out.println("Reverse of a String  is : " + reverseStr(str));//called method  
    }
    
//reverse string method  

    static String reverseStr(String str) {
        String r = "";
        for (int i = str.length(); i > 0; i--) //execute until condition i>0 becomes false  
        {
            r = r + (str.charAt(i - 1));
        }
        return r;//r will return the value
    }
}
