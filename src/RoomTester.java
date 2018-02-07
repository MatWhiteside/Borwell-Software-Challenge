import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tester class for {@link Room}.
 * Runs four tests on each method:
 *  - All the same values
 *  - 0 as all values
 *  - Negatives as all values
 *  - Random values
 */
public class RoomTester {
    @Test
    public void areaTestOne() {
        Room testRoom = new Room(10, 10, 10);
        assertEquals(100, testRoom.calculateArea());
    }

    @Test
    public void areaTestTwo() {
        Room testRoom = new Room(0, 0, 0);
        assertEquals(0, testRoom.calculateArea());
    }

    @Test
    public void areaTestThree() {
        Room testRoom = new Room(-10, -10, -10);
        assertEquals(100, testRoom.calculateArea());
    }

    @Test
    public void areaTestFour() {
        Room testRoom = new Room(5.5, 3.2, 10.7);
        assertEquals(17.6, testRoom.calculateArea());
    }

    @Test
    public void paintRequiredTestOne() {
        Room testRoom = new Room(10, 10, 10);
        assertEquals(40, testRoom.calculatePaintRequired());
    }

    @Test
    public void paintRequiredTestTwo() {
        Room testRoom = new Room(0, 0, 0);
        assertEquals(0, testRoom.calculatePaintRequired());
    }

    @Test
    public void paintRequiredTestThree() {
        Room testRoom = new Room(-10, -10, -10);
        assertEquals(40, testRoom.calculatePaintRequired());
    }

    @Test
    public void paintRequiredTestFour() {
        Room testRoom = new Room(5.5, 3.2, 10.7);
        // Round the answer to two decimal places
        assertEquals(18.62, Math.round(testRoom.calculatePaintRequired() * 100.0) / 100.0);
    }

    @Test
    public void roomVolumeTestOne() {
        Room testRoom = new Room(10, 10, 10);
        assertEquals(1000, testRoom.calculateVolume());
    }

    @Test
    public void roomVolumeTestTwo() {
        Room testRoom = new Room(0, 0, 0);
        assertEquals(0, testRoom.calculateVolume());
    }

    @Test
    public void roomVolumeTestThree() {
        Room testRoom = new Room(-10, -10, -10);
        assertEquals(1000, testRoom.calculateVolume());
    }

    @Test
    public void roomVolumeTestFour() {
        Room testRoom = new Room(5.5, 3.2, 10.7);
        // Round the answer to two decimal places
        assertEquals(188.32, testRoom.calculateVolume());
    }
}
