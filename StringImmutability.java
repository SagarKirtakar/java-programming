        /*  String Immutability program  */

public class StringImmutability {
    
    public static void main(String[] args) {
        
        // String Literals

        String s1 = "sagar";

        String s2 = "sagar";

        s1 = s1.concat("kirtakar");

        System.out.println(s1);

        System.out.println(s2);

        //---------------

        String a = new String("ankit");

        String b = "ankit";

        a = a.concat("kumar");

        System.out.println(a);

        System.out.println(b);

    }
}
