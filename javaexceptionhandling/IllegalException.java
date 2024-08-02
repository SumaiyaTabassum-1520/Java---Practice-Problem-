
package javaexceptionhandling;

class IllegalTriangleException extends Exception {

    IllegalTriangleException() {
        super("Rule Violation: The Sum of any two sides is greater than the third");
    }

}