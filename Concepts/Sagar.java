package Concepts;

import java.util.Scanner;

public class Sagar implements Client {

    String userName; double sal;

    @Override
    public void input() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your userName: ");
       userName = sc.next();

        System.out.println("Enter your salary: ");
        sal = sc.nextDouble();

    }

    @Override
    public void output() {
       System.out.println("UserName: "+userName+ " Salary: "+sal);
    }
    public static void main(String[] args) {
        Sagar sg = new Sagar();
        sg.input();
        sg.output();
    }
}
