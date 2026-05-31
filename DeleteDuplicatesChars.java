            /*   Delete duplicates characters in given String     */

public class DeleteDuplicatesChars {
    public static void main(String[] args) {

        String str1 = "Hello World";

        String result = str1.replaceAll("l", "");

        System.out.println("Before String: "+str1);

        System.out.println("After String: "+result);
        
    }
}