                    /* Prime number Program */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n, count=0; // 7 
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = ref.nextInt();
        
        for(int i=1; i<=n; i++) {
            if(n%i ==0) 
               count++; 
        }
        if(count == 2) {
            System.out.println(n+" is prime number");
        }else {
            System.out.println(n+" is not prime number");
        }
    }
}
