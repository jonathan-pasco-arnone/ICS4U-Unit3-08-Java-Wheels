/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This program uses a custom class.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        // Variables/Constants
        final int three = 3;
        final int twelve = 12;

        final String wheels = " wheels.";

        final Truck cheif = new Truck("Blue", 210, "BAZINGA", 4);
        final Bicycle zeus = new Bicycle("Red", 30, 2);

        System.out.println("\nChief (the truck's name) has "
                           + cheif.getQuantityWheels() + wheels);

        System.out.println("\nZeus (the bike's name) has "
                           + zeus.getQuantityWheels() + wheels);

        zeus.accelerate(twelve);
        System.out.println("\nZeus has accelerated to " + zeus.getSpeed());
        zeus.brake(three);
        System.out.println("Zeus has had its speed lowered to "
                           + zeus.getSpeed());
    }
}
