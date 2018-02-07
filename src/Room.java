/**
 * Class that models a basic room.
 */
public class Room {
    private double width;
    private double length;
    private double height;

    /**
     * Creates the room with a given width, length and height.
     * @param width Width of the room given in meters.
     * @param length Length of the room given in meters.
     * @param height Height of the room given in meters.
     */
    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the floor.
     * @return Area of the floor (in m^2).
     */
    public double calculateArea() {
        return width * length;
    }
}
