/*
 * This is the standard Main.java starting point.
 *
 * @author  Andi Cucka
 * @version 1.0
 * @since   2024-03-27
 */

/**
 * This is the Main program.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called.
     *
     * @throws IllegalStateException if instantiation is attempted
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(String[] args) {
        final CarStack fruits = new CarStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println("fruits: " + fruits.showStack());

        final CarStack colours = new CarStack();
        colours.push("red");
        colours.push("green");
        colours.push("blue");
        System.out.println("colours: " + colours.showStack());

        final CarStack cars = new CarStack();
        cars.push("square");
        cars.push("triangle");
        cars.push("circle");
        System.out.println("cars: " + cars.showStack());

        System.out.println("\nDone.");
    }
}
