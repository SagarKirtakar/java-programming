        /*  Sum of Digits of a number */
// input 5 -----> 5 + 4 + 3 + 2 + 1 

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int n, res = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");

        n = sc.nextInt();

        for(int i= 1; i<=n; i++) {
            res = res + i;
        }

        System.out.println("Sum of digit is: "+res);
    }
}
