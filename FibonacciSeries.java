            /*  w.a.p to print Fibonacci Series    */
// 0 1 1 2 3 5 8 13 21 

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        int term, a=0, b=1, c;

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter term: ");
        term  = ref.nextInt();

        for(int i=0; i<= term; i++) {

            System.out.print(a+ " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}