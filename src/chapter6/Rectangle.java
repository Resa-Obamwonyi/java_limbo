package chapter6;


// General class component
public class Rectangle {
    private double length;
    private double width;

    // A default constructor, default cos no parameters, typically used to assign default values
    // used to initialize values, i.e python's init
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width); // can be set as this.width = width
    }

    // classes should practise encapsulation, i.e fields should be private
    // methods to access fields should be public
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
