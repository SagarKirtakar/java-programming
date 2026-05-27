                  /*  Reverse Number Program */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int r,n;

        Scanner ref = new Scanner(System.in);
        
        System.out.println("Enter any number: ");

        n = ref.nextInt();

        while(n>0) {
            r = n%10;
            
            System.out.print(r);

            n = n / 10;
        }

    }
}
