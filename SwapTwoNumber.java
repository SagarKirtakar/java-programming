// Swap Two numbers with or without using third variable
import java.util.*;
class SwapTwoNumber {

    public static void main(String[] args) {
      int a, b;
      System.out.println("Enter any two numbers: ");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println("Before swapping: "+a+" "+b);
      a = a + b; // 100 + 200 = 300
      b = a - b; //  300 - 200 = 100
      a = a - b; // 300 - 100 = 200
      System.out.println("After swapping: "+a+" "+b);

    }
}