public class MethodOverloading {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    // Same method name but different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Create an object of MethodOverloading class
        MethodOverloading mo = new MethodOverloading();

        // Call the add() method with three arguments
        // Java automatically selects the matching method
        int sum = mo.add(10, 20, 30);

        // Print the result
        System.out.println(sum);
    }

    // POINTS REMEMBER : 
    // 1. Method name same but type of parameters, 
    // number of parameters and 
    // order of parameters must be different.
    // 2. Return type alone can not overload the method.
    // 3. Static and not-static methods can be overloaded.
    // 4. Constrcutor can be overoaded but diffrent parameters.
    // 5. Its compile time polymorphism because compiler decides 
    // which methods to call during compilation based on the argument passed.
    

}