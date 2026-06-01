            /*  Check Anagram String or not */

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        
        String str1 = "listen";

        String str2 = "silent";

        char [] charArray1 = str1.toCharArray();

        char [] charArray2 = str2.toCharArray();

        if(charArray1.length != charArray2.length) {
            System.out.println("Not Anagram String");
            System.exit(0);
        }

        Arrays.sort(charArray1);

        Arrays.sort(charArray2);

        for(int i=0; i<charArray1.length; i++) {
            if(charArray1[i] != charArray2[i]) {
                System.out.println("Not Anagram String");
                System.exit(0);
            }
        }

        System.out.println("Anagram String...");

    }
}
