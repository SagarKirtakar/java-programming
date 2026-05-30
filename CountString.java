            /* W.a.p Count characters of String program */

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {

        String ch;

        Scanner ref = new Scanner(System.in);
        
        System.out.println("Enter any String for count total characters: ");

        ch = ref.next();

        int count  = ch.length();

        System.out.println("Total characters of String is: "+count);
    }
}
