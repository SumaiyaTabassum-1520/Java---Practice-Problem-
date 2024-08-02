
package javaexceptionhandling;

import java.util.*;

public class Calculator {

    int x, y;
    Scanner input = new Scanner(System.in);

    Calculator() {

    }

    Calculator(int num1, int num2) {
        this.x = num1;
        this.y = num2;
    }

    public int Add(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative number can not be add");

        } else {
            return num1 + num2;
        }

    }

    public int Subtract(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative number can not be subtract");

        } else {
            return num1 - num2;
        }
    }

    public int Multiply(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Can't multiply a number by zero");

        } else {

            return num1 * num2;
        }

    }

    public int Division(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Can't divide a number by zero");

        } else {

            return num1 / num2;
        }

    }

    public void run() {
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        Calculator obj3 = new Calculator();
        Calculator obj4 = new Calculator();

        int number1, number2;
        try {
            System.out.println("Enter two number for adding");
            number1 = input.nextInt();
            number2 = input.nextInt();
            try {

                int result = obj1.Add(number1, number2);
                System.out.println(number1 + " + " + number2 + " is " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: "+ex);
            }
            System.out.println("Enter two number for subtraction");
            number1 = input.nextInt();
            number2 = input.nextInt();
            try {
                int result = obj2.Subtract(number1, number2);
                System.out.println(number1 + " + " + number2 + " is " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: "+ex);
            }
            System.out.println("Enter two number for Multiplication");
            number1 = input.nextInt();
            number2 = input.nextInt();
            try {
                int result = obj3.Multiply(number1, number2);
                System.out.println(number1 + " + " + number2 + " is " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: "+ex);
            }
            System.out.println("Enter two number for division");
            number1 = input.nextInt();
            number2 = input.nextInt();
            try {
                int result = obj4.Division(number1, number2);
                System.out.println(number1 + " + " + number2 + " is " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: "+ex);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Exception: number should be integer");

        }
    }

    public void question3() {

        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int i;
        while (true) {
            System.out.println("Enter the index number");
            i = input.nextInt();
            if (i == -1) {
                break;
            }
            try {
                System.out.println(array[i]);
                if (i < 0 || i > array.length) {
                    throw new ArrayIndexOutOfBoundsException();

                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Exceptions: "+ex);

            }
        }
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.run();
        cal.question3();

    }
}

