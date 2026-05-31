            /*   Delete duplicates characters in given String     */

public class DeleteDuplicatesChars {
    public static void main(String[] args) {

        String str1 = "Hello World";

        // First Way 

        // String result = str1.replaceAll("l", "");

        // System.out.println("Before String: "+str1);

        // System.out.println("After String: "+result);

        // Second Way

        String result = "";

        for(int i=0; i< str1.length(); i++) {
            if(result.indexOf(str1.charAt(i)) == -1){
                
            }
        }

    }
}