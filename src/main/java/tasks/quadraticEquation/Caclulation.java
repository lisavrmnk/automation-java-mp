package tasks.quadraticEquation;

public class Caclulation {

    int a;
    int b;
    int c;


    public void calc() {

        //Declaring x1 and x2 as double values
        double x1;
        double x2;
        int discr = (b * b - 4 * a * c);

        //Checking if we can make a division by a
        if (a == 0) { //
            System.out.println("There is no way to solve the equation.");
        }

        //Checking if square root will have a valid solution
        else if (discr >= 0) {
            x1 = (-b + Math.sqrt(discr)) / (2 * a);
            x2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("There is no way to solve the equation.");
        }
    }


    //Define set method to modify the variable a
    public void setA(int a) {
        this.a = a;
    }

    //Define set method to modify the variable b
    public void setB(int b) {
        this.b = b;
    }

    //Define set method to modify the variable c
    public void setC(int c) {
        this.c = c;
    }


}
