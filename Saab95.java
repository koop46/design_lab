import java.awt.*;

public class Saab95 extends Car{ // class declaration, public: accessible from any class

    // instance variables
    public boolean turboOn;

    public Saab95(){
        super(2, 125, Color.red, "Saab95", 0, 0, 2500);
	    turboOn = false;
        stopEngine();
    }

    // saab metoder
    public void setTurboOn(){
	    turboOn = true;
    }
    public void setTurboOff(){
	    turboOn = false;
    }

    //                                              metoder till interface
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return super.getEnginePower() * 0.01 * turbo;
    }




}
