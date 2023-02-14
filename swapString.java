package problemstring;
import java.util.*;
public class swapString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two String : ");
        String str1=input.nextLine();
        String str2 =input.nextLine();
        System.out.println("The swap string is : "+swapString(str1,str2)+" "+swapString(str2,str1));
        
    }
    
    
    static String swapString(String str1,String str2) {
        
        str1=str1+str2;
        str2 = str1.substring(0, (str1.length() - str2.length())); 
        str1 = str1.substring(str2.length()); 
        return(str1);
       
    }
}
