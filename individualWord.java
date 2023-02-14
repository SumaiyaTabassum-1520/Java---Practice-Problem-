package problemstring;

import java.util.*;

public class individualWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        String[] result = tokenizer(str);
        for (int i = 0; result[i]!=null ; i++) {
            System.out.println(result[i]);
        }
    }
    static String[] tokenizer(String text) {
        String tokenized[] = new String[100];
        int j = 0;
        tokenized[j]="";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                j++;
                tokenized[j]="";
            } else {

                tokenized[j] = tokenized[j] + text.charAt(i);
            }
        }
        return tokenized;
    }
}
