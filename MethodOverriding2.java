// Child class inherits properties and methods from MethodOverriding
public class MethodOverriding2 extends MethodOverriding {

    // Method defined in child class
    int mul(int a, int b) {
        return a * b;
    }

    @Override
    int add(int a, int b) {
        return a + b + 100;
    }

    @Override
    double sub(double a, int b) {
        return a - b - 20;
    }

    public static void main(String[] args) {

        // Create an object of child class
        MethodOverriding2 mo = new MethodOverriding2();

        // Calling child class method
        int mul = mo.mul(5, 5);

        // Calling inherited parent class method
        int add = mo.add(10, 20);

        // Calling another inherited parent class method
        double sub = mo.sub(50, 25);

        // Print multiplication result
        System.out.println("Multiplication : " + mul);

        // Print addition result
        System.out.println("Addition : " + add);

        // Print subtraction result
        System.out.println("Subtraction : " + sub);
    }

    // POINTS MUST REMEMBER :
    // 1.  Inheritance is required withou this its impossible.
    // 2. Method name must be the same.
    // 3. Parameters must be the same.
    // 4. return type must be the same.
    // 5. Method Overriding provides Runtime polymorphism.

}