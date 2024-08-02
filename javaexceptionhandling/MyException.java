
package javaexceptionhandling;

import java.util.Scanner;

class MyExceptions extends Exception {

    MyExceptions(String message) {
        super(message);
    }

    MyExceptions() {
        super("Exceptions: Product is invalid");
    }
}

class Product {

    Product() {

    }
    Scanner input = new Scanner(System.in);

    public void productCheck(int weight) {
        try {
            if (weight < 100) {
                throw new MyExceptions();
            } else {
                System.out.println("weight of the product is " + weight);
            }
        } catch (MyExceptions e) {
            System.out.println(e.getMessage());

        }
    }

    public void question2() {

        int weight;
        while (true) {
            System.out.println("Input the weight");
            weight = input.nextInt();
            if (weight == -1) {
                break;
            }
            else{
                this.productCheck(weight);
            }
        }
        
    }

    public static void main(String[] args) {

        Product pr = new Product();
        pr.question2();
        

    }

}
