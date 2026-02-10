import java.awt.*;

public abstract class Scania extends SpecialCar {

    public final static double trimFactor = 1.25;

    public Scania() {
        super(2, 200, Color.white, "Scania", 0 , 0, 5000);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }


    public void lowerRamp(int angleDecrease) {
        int newAngle = bedAngle - angleDecrease;
        if (super.getCurrentSpeed() == 0) {
            if (newAngle >= 0) {
                bedAngle = newAngle;
            } else {
                System.out.println(
                        String.format("New angle is %d, can't go lower than 0", newAngle)
                );
            }
        } else {
            System.out.println("Please stop the truck");
        }
    }

    public void raiseRamp(int angleIncrease) {
        int newAngle = bedAngle + angleIncrease;
        if (super.getCurrentSpeed() == 0) {
            if (newAngle <= 70) {
                bedAngle = newAngle;
            } else {
                System.out.println(
                        String.format("New angle is %d, can't go higher than 70", newAngle)
                );
            }
        } else {
            System.out.println("Please stop the truck");
        }
    }


}
