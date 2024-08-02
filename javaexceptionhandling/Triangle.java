
package javaexceptionhandling;

import java.util.*;

public class Triangle extends GeometricObject {
    
    double side1,side2,side3;
    Scanner input = new Scanner(System.in);
    
    Triangle(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
        
    }
    Triangle(double s1,double s2,double s3) throws IllegalTriangleException {
        if(s1+s2<=s3 || s1+s3 <= s2 || s2+s3 <= s1){
            throw new IllegalTriangleException();
        } 
        
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
         
     }
     public double getSide1(){
         return this.side1;
     }
     public double getSide2(){
         return this.side2;
     }
     public double getSide3(){
         return this.side3;
     }
     
     public double getArea(){
         double p=getPerimeter()/2;
         double val =p*(p-side1)*(p-side2)*(p-side3);
         double area=Math.sqrt(val);
         return area;
     }
     public double getPerimeter(){
         double perimeter=side1+side2+side3;
         return perimeter;
     }
    @Override
     public String toString(){
         return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;
     }
     
     
}
