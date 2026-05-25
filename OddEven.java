// Odd Even Program

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println(n+ " is Even number");
        }else {
            System.out.println(n+ " is odd number");
        }
    }
}
