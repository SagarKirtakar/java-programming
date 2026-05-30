            /* Reverse String Program  */

public class ReverseString {
    public static void main(String[] args) {
        
        // StringBuffer r = new StringBuffer("Learn Coding");
       
        // System.out.println(r.reverse()); //gnidoC nraeL

        // StringBuilder ref = new StringBuilder("Java Coding");
        
        // System.out.println(ref.reverse()); // gnidoC avaJ

        String s1 = "Learn Coding";

        String s2 = "";

        int len = s1.length();

        for(int i = len-1; i>=0; i--) {

            s2 = s2 + s1.charAt(i);
        }

        System.out.println("Original String: "+s1);

        System.out.println("Reverse String: "+s2);
        
    }
}
