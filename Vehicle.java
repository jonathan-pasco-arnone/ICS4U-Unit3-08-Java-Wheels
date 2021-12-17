/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-14
*/

/**
* This is the class that contains many functions.
*/
public class Vehicle {

    /**
    * The current speed.
    * Protected is similar to private, but it is avaiable to subclasses as
    * well. It is not available anywehre outside of this class and its
    * subclasses.
    */
    protected int speed;

    /**
    * The quantity of wheels.
    */
    protected int quantityWheels;

    /**
    * The colour of the vehicle.
    */
    private String colour;

    /**
    * The max speed.
    */
    private int maxSpeed;

    /**
    * This function takes the initial values of a vehicle.
    *
    * @param startColour the starting colour
    * @param vehicleMaxSpeed the maximum speed of the car
    * @param initialQuantityWheels the starting quantity of wheels
    */
    public Vehicle(final String startColour, final int vehicleMaxSpeed,
                   final int initialQuantityWheels) {
        colour = startColour;
        speed = 0;
        maxSpeed = vehicleMaxSpeed;
        quantityWheels = initialQuantityWheels;
    }

    /*
    *
    * Getters
    *
    */

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public String getColour() {
        return colour;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public int getSpeed() {
        return speed;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /*
    *
    * Setters
    *
    */

    /**
    * Sets the value.
    *
    * @param newColour the new license plate
    */
    public void setColour(final String newColour) {
        colour = newColour;
    }

    /*
    *
    * Other Functions
    *
    */

    /**
    * Accelerates a car.
    *
    * @param acceleration the amount ot which the speed will be amplified
    */
    public void accelerate(final int acceleration) {
        if (acceleration + speed > maxSpeed) {
            System.out.println("Cannot accelerate more"
                + " than the maximum speed");
        } else {
            speed = speed + acceleration;
        }
    }

    /**
    * Applies brakes to a car.
    *
    * @param brakeAmount the amount to which the speed will be reduced
    */
    public void brake(final int brakeAmount) {
        if (brakeAmount > speed) {
            System.out.println("Cannot brake more than the current speed");
        } else {
            speed = speed - brakeAmount;
        }
    }
}
