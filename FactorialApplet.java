import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Applet class to compute factorial
public class FactorialApplet extends Applet implements ActionListener {
    private TextField inputField;
    private Button computeButton;
    private Label resultLabel;

    public void init() {
        // Initialize components
        inputField = new TextField(10);
        computeButton = new Button("Compute Factorial");
        resultLabel = new Label("Factorial will be displayed here.");

        // Add components to the applet
        add(inputField);
        add(computeButton);
        add(resultLabel);

        // Register action listener for the button
        computeButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeButton) {
            try {
                // Get the number from input field
                int number = Integer.parseInt(inputField.getText());

                // Compute factorial
                long factorial = computeFactorial(number);

                // Display result
                resultLabel.setText("Factorial of " + number + " is " + factorial);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // Method to compute factorial recursively
    private long computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
