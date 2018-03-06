package tasks.quadraticEquation;

import java.util.Scanner;

public class InputValues {

    static Scanner reader = new Scanner(System.in);// Reading from System.in
    private int a;
    private int b;
    private int c;

    public void input() {

        Caclulation calc = new Caclulation();

        // Asking the user to input value (a) from the console
        System.out.println("Enter the first value in a quadratic equation: ");
        a = reader.nextInt(); // Scans the next token of the input as integer
        calc.setA(a);

        // Asking the user to input value (b) from the console
        System.out.println("Enter the second value in a quadratic equation: ");
        b = reader.nextInt(); // Scans the next token of the input as integer
        calc.setB(b);

        // Asking the user to input value (c) from the console
        System.out.println("Enter the third value in a quadratic equation: ");
        c = reader.nextInt(); // Scans the next token of the input as integer
        calc.setC(c);

        //Once reader from console finished
        reader.close();
    }

    //Define get method to access these variable a
    public int getA() {
        return a;
    }

    //Define get method to access these variable b
    public int getB() {
        return b;
    }

    //Define get method to access these variable c
    public int getC() {
        return c;
    }
}



