            /*  w.a.p Palindrome number or not */
// input number 121 ---> 121 

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        
        int n,s=0, r,c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number: ");

        n = sc.nextInt();

        c=n;

        while(n>0) {
           r = n%10;
           s = (s*10) + r; 
        }
    }
}
