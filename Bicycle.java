/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This is the class that contains many functions.
*/
public class Bicycle extends Vehicle {
    /**
    * The license plate of the vehicle.
    */
    private static int cadence;

    /**
    * Calls the constructor of Airplane, Jet's superclass.
    *
    * @param startColour the starting colour of the bike
    * @param startMaxSpeed the maximum speed of the bike
    * @param inititalQuantityWheels the initial amount of wheels
    */
    public Bicycle(final String startColour, final int startMaxSpeed,
                   final int inititalQuantityWheels) {
        super(startColour, startMaxSpeed, inititalQuantityWheels);
        cadence = 0;
    }

    /**
    * Gets the number of wheels.
    *
    * @return gets the number of wheels
    */
    public int getQuantityWheels() {
        return super.quantityWheels;
    }

    /**
    * Gets the cadence.
    *
    * @return gets the cadence
    */
    public int getCadence() {
        return cadence;
    }

    /**
    * Sets the cadence.
    *
    * @param newCadence the new cadence
    */
    public void setCadence(final int newCadence) {
        cadence = newCadence;
    }

    /**
    * Rings the bell of the bike.
    */
    public void ringBell() {
        System.out.println("Ring!");
    }

}
