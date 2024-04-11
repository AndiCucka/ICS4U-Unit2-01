/*
 * Class that defines string stack.
 *
 * @author  Andi Cucka
 * @version 1.0
 * @since   2024-01-01
 */
import java.util.ArrayList;
import java.util.List;

// Define a class called CarStack
public class CarStack {
    // Declare a private property to hold the stack elements
    private List<String> strStack;

    // Constructor to initialize the stack
    public CarStack() {
        strStack = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(String input) {
        strStack.add(input);
    }

    // Method to show the elements of the stack
    public String show() {
        // Create a StringBuilder to construct the output string
        StringBuilder values = new StringBuilder();
        // Iterate through the elements of the stack
        for (String item : strStack) {
            // Append each element followed by a comma and space
            values.append(item).append(", ");
        }
        // Remove the trailing comma and space if the stack is not empty
        if (!strStack.isEmpty()) {
            values.delete(values.length() - 2, values.length());
        }
        // Return the constructed string
        return values.toString();
    }
}
