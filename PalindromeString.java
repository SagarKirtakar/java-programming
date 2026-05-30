                /*  W.a.p to Check Palindrome String or not */

public class PalindromeString {
    public static void main(String[] args) {
        
        String os = "nayan";

        String rev = "";

        for(int i= os.length()-1; i>=0; i--) {
            rev += os.charAt(i);
        }

        System.out.println("Original String: "+os);

        System.out.println("Reverse String: "+rev);

        if(os.equals(rev)) {
            System.out.println("String is palindrome ");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
