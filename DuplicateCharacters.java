            /*  Find Duplicates characters in a given String */

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = new String("Amaravati");
        int count = 0;

        char [] charArray = str.toCharArray();

        for(int i=0; i<charArray.length; i++) {
            for(int j= i+1; j<charArray.length; j++) {
                if(charArray[i] == charArray[j]) {
                    System.out.println("Duplicate characters of String: "+charArray[j]);
                    count++;
                }
            }
        }

        System.out.println("Total Duplicates characters: "+count);

    }
}
