
package javaexceptionhandling;

public class GeometricObject {
    private String color=" ";
    private boolean filled;
    
    GeometricObject(){     
    }
    GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;     
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;       
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;       
    }   
    
}
