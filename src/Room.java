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

    /**
     * Calculates the liters of paint required to paint all walls.
     * Assumptions:
     *  - Amount of paint required is for 1 coat.
     *  - It's presumed there are no doors or windows in the room (we don't have this data).
     *  - 1 litre of paint covers 10m^2 of wall
     * @return Liters of paint required to paint all walls.
     */
    public double calculatePaintRequired() {
        // Calculate the total area of all the walls.
        double lengthWallsArea = length * height;
        double widthWallsArea = width * height;
        double totalWallArea = (lengthWallsArea + widthWallsArea) * 2;

        // Divide the total area by the amount of wall covered per litre of paint.
        return totalWallArea / 10.0;
    }

    /**
     * Calculates the volume of the room in m^3.
     * @return Volume of the room in m^3.
     */
    public double calculateVolume() {
        return width * height * length;
    }
}
