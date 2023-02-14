package problemstring;

import java.util.*;

public class vowelAndConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        str = str.toLowerCase();
        System.out.println("Number of vowels: " + vowelCount(str));
        //System.out.println("Number of consonants: " +consonantCount(str) );
        
    }
    

    static int vowelCount(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            }         
        }
        return vowelCount;
    }
    
}
