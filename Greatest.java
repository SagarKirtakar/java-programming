// Find the greatest of three number

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        System.out.println("Enter any three number: ");
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b ) { // a = b
            if(a>c) // a = c
                System.out.println(a+" is greater");
            else 
                System.out.println(c+" is greater");
        }else {
            if(b>c) {   // b = c
                System.out.println(b+" is greater");
            }else{
                System.out.println(c+" is greater");
            }
        }
    }
}
