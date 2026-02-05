import java.awt.*;

public class Scania extends Car {

    public final static double trimFactor = 1.25;
    private int bedAngle = 0;

    public Scania() {
        super(2, 200, Color.white, "Scania", 0 , 0);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

    public void raiseBedAngle (int angleIncrease) {
        int newAngle = bedAngle + angleIncrease;
        if (super.getCurrentSpeed() == 0) {
            if (newAngle <= 70) {
                bedAngle = newAngle;
            }
            else {System.out.println(
                    String.format("New angle is %d, can't go higher than 70", newAngle)
            );}
        }

        else {System.out.println("Please stop the truck");}
    }


    public void lowerBedAngle (int angleDecrease) {
        int newAngle = bedAngle - angleDecrease;
        if (super.getCurrentSpeed() == 0) {
            if (newAngle >= 0) {
                bedAngle = newAngle;
            }
            else {System.out.println(
                    String.format("New angle is %d, can't go lower than 0", newAngle)
            );}
        }

        else {System.out.println("Please stop the truck");}
    }


    public int getBedAngle() {return bedAngle;}




}
