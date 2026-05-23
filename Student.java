public class Student {
    
    String name;
    int roll;

    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sagar";
        s1.roll = 101;

        s1.display();
    }
}
