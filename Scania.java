import java.awt.*;

public class Scania {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x_value = 0;
    private double y_value = 0;
    private int direction = 0;
    private int bedAngle;

    public Scania(){

        nrDoors = 4;
        enginePower = 100;
        currentSpeed = 0;
        color = Color.black;
        modelName = "Scania";
        x_value = 0;
        y_value = 0;
        direction = 0;
        bedAngle = 0;

    }

    public void raiseBedAngle (int angleIncrease) {
        int newAngle = bedAngle + angleIncrease;
        if (currentSpeed == 0) {
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
        if (currentSpeed == 0) {
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
