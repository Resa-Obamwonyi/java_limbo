package chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){

        // Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);

        double areaOfRoomOne = room1.calculateArea();


        // Rectangle 2
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoomTwo = room2.calculateArea();

        double totalArea = areaOfRoomOne + areaOfRoomTwo;

        System.out.println("Area of both rooms: " +totalArea);
    }
}
