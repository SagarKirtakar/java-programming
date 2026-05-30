                /*  Check input characters are Vowel or Consonant */

import java.util.Scanner;

public class VowelOrConsonant {
    
    public static void main(String[] args) {
        char ch;

        Scanner ref = new Scanner(System.in);
        
        System.out.println("Enter any character you want to check Vowels or Consotant: ");

        ch = ref.next().charAt(0);

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowels");
        }else {
            System.out.println("Consonant");
        }
    }
}
