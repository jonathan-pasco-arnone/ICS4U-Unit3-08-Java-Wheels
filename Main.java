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

        final int five = 5;
        final int fifty = 50;
        final int oneHundred = 100;

        final Truck cheif = new Truck("Blue", 210, "BAZINGA");
        final Bicycle zeus = new Bicycle("Red", 30);

        cheif.accelerate(oneHundred);
        System.out.println("\nChief (the truck's name) has accelerated to "
                           + "a speed of " + cheif.getSpeed());
        cheif.provideAir(five);

        System.out.println("Chief has used his air brakes to a degree of 5 "
                           + "and now has a speed of " + cheif.getSpeed());

        System.out.println("\nZeus (the bike's name) has a max speed of "
                           + zeus.getMaxSpeed());
        System.out.println("Zeus is attempting to accelerate to 50");
        zeus.accelerate(fifty);

        System.out.println("\nZeus is about to be rung...");
        zeus.ringBell();
    }
}
