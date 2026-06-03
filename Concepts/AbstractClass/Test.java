package Concepts.AbstractClass;

public class Test {
    
    public static void main(String[] args) {
        Car v1 = new Car();
        System.out.println("Car is "+v1.color);
        v1.Start();
        v1.drive();

      Vehicle v2 = new Bike();
       v2.Start();
        v2.drive();

        Vehicle v3 = new Bycycle();
        v3.drive();
    }
}
