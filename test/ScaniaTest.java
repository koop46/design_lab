import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;

class ScaniaTest {
    private Scania scania1;
    @BeforeEach
    void setup() { scania1 = new Scania(); }

    @Test
    void raiseBedAngle() {
        scania1.raiseBedAngle(10);
        assertEquals(10, scania1.getBedAngle());
        scania1.raiseBedAngle(70);
        assertEquals(10, scania1.getBedAngle());
        scania1.raiseBedAngle(20);
        assertEquals(30, scania1.getBedAngle());
    }

    @Test
    void lowerBedAngle() {
        scania1.raiseBedAngle(55);
        scania1.lowerBedAngle(10);
        assertEquals(45, scania1.getBedAngle());
        scania1.lowerBedAngle(70);
        assertEquals(45, scania1.getBedAngle());
        scania1.lowerBedAngle(20);
        assertEquals(25, scania1.getBedAngle());
    }
}