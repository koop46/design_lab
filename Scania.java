import java.awt.*;

public class Scania extends SpecialCar {

    public final static double trimFactor = 1.25;

    public Scania() {
        super(2, 200, Color.white, "Scania", 0 , 0);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

}
