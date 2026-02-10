import java.awt.*;

public abstract class SpecialCar extends Car {

    // attributes
    public boolean ramplowered; //Jag tror dessa måste vara public när vi sätter de som standard på 0 och false. Error löstes när jag satte de till public från private
    public int bedAngle;

    public SpecialCar(int nrDoors, double enginePower, Color color, String modelName, double x_value, double y_value) {
        super(nrDoors, enginePower, color, modelName, x_value, y_value);
        this.ramplowered = false; //alla bilar börjar med false och 0 så slipper vi skriva in det när vi skapar varje scania
        this.bedAngle = 0;
    }



    //getters
    public int getBedAngle(){return bedAngle;}
    public boolean isRamplowered(){return ramplowered;}

    //action methods
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

    public void lowerRamp() {
        boolean ramplowered = true;
    }
    public void raiseRamp() {
        boolean ramplowered = false;
    }
 /* TODO Kopierat från CANVAS
 Rampen kan endast vara nere om biltransporten står stilla.
Bilar kan endast lastas om rampen är nere, och de befinner sig rimligt nära biltransporten (gör ett eget antagande, de exakta detaljerna är inte viktiga).
Bilar kan endast lossas om rampen är nere. De bör då hamna rimligt nära biltransporten.
Bilar kan endast lossas i omvänd ordning från hur de lastades, dvs den sista bilen som lastades måste vara först att lossas (first-in-last-out).
Biltransporten ska inte kunna lasta på en annan biltransport.
Under det att en bil är lastad på biltransporten ska dess position i världen alltid vara densamma som biltransportens position.
  */
}