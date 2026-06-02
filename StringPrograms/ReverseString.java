        /*  Reverse String  */

package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Sagar";
        String result = "";

        int len = s.length();

        for(int i = len - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        System.out.println(result);
    }
}