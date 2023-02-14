package problemstring;

import java.util.*;

public class totalNumberOfChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=input.nextLine();
        //System.out.println("The charecters of the strings are : "+ countChar(str));
        System.out.println(new totalNumberOfChar().countChar(str));
        
    }
    
    private int countChar(String str){
        
        int count=0;
        for (int i = 0; i < str.length(); i++) {      
            if(str.charAt(i)!=' '){     
            count++;
            }
        } 
      return count;
    }
}
