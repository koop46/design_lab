import java.awt.*;

public class CarTransport extends Car {

    public final static double trimFactor = 1.25;

    public CarTransport() {
        super(2, 250, Color.blue, "Biltransport", 0 , 0, 6000);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

    public void lowerRamp() {
        if (getCurrentSpeed() == 0) {
            ramplowered = true;
        } else {
            System.out.println("Please stop the truck");
        }
    }
    public void raiseRamp() {
        ramplowered = false;
    }
}
