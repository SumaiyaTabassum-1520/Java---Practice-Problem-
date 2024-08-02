
package javaexceptionhandling;

import java.util.*;
public class TestProgram {

    Scanner input = new Scanner(System.in);

    TestProgram() {

    }

    public void testProgram() {

        System.out.println("Enter the first side of a triangle ");
        double side1 = input.nextDouble();
        System.out.println("Enter the second side of a triangle ");
        double side2 = input.nextDouble();
        System.out.println("Enter the third side of a triangle ");
        double side3 = input.nextDouble();
        System.out.println("Enter the color");
        input.next();
        String color = input.nextLine();
        System.out.println("Enter whether triangle is filled");
        boolean filled = input.nextBoolean();

        try {
            Triangle tr = new Triangle(side1, side2, side3);
            tr.setColor(color);
            tr.setFilled(filled);
            System.out.println("Area of the triangle " + tr.getArea());
            System.out.println("Perimeter of the triangle " + tr.getPerimeter());
            System.out.println("color " + tr.getColor());
            System.out.println("is filled" + (tr.getFilled() ? " true " : " false "));
        }catch(IllegalTriangleException ex){
            System.out.println("exception: "+ex.getMessage());
        }

    }

    public static void main(String[] args) {
        TestProgram tr = new TestProgram();
        tr.testProgram();
    }
}
