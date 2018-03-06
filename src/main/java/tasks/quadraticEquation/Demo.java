package tasks.quadraticEquation;

public class Demo {
    public static void main(String[] args) {

        //Creating new object InputValues
        InputValues consoleInput = new InputValues();
        //Call input method from InputValues class
        consoleInput.input();


        //Creating new object Calculation
        Caclulation variables = new Caclulation();
        variables.setA(consoleInput.getA()); //Define set method to modify the variable a from the console
        variables.setB(consoleInput.getB()); //Define set method to modify the variable b from the console
        variables.setC(consoleInput.getC()); //Define set method to modify the variable c from the console

        //Call calc method from Calculation class
        variables.calc();
    }
}
