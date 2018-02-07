import java.util.Scanner;

/**
 * Takes as input the dimensions of a room and outputs the following:
 * - Area of the floor
 * - Amount of paint required to paint the walls
 * - Volume of the room
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the width, makes sure its a double
        System.out.print("Enter room width: ");
        while (!in.hasNextDouble()) {
            System.out.print("Please enter a valid width.\nEnter room width: ");
            in.next();
        }
        double width = in.nextDouble();

        // Input the length, makes sure its a double
        System.out.print("Enter room length: ");
        while (!in.hasNextDouble()) {
            System.out.print("Please enter a valid length.\nEnter room length: ");
            in.next();
        }
        double length = in.nextDouble();

        // Input the height, makes sure its a double
        System.out.print("Enter room height: ");
        while (!in.hasNextDouble()) {
            System.out.print("Please enter a valid height.\nEnter room height: ");
            in.next();
        }
        double height = in.nextDouble();

        // Create a new room and output the data.
        Room r = new Room(width, length, height);

        System.out.println("Area of the floor: " + r.calculateArea() + "^2");
        System.out.println("Amount of paint required to paint the walls: " + r.calculatePaintRequired() + " litres.");
        System.out.println("Volume of the room: " + r.calculateVolume() + "^3");

    }
}
