package Business.Utils;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author goutam
 */
public class MyDbleVerifClass extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
if (text.isEmpty()) {
    input.setBackground(Color.red);
    return false;
}

try {
    double number = Double.parseDouble(text);
    if (number < 0) {
        input.setBackground(Color.red);
        JOptionPane.showMessageDialog(input, "Number cant be negative", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    input.setBackground(Color.white);
    return true;
} catch (NumberFormatException e) {
    input.setBackground(Color.red);
    JOptionPane.showMessageDialog(input, "Please enter valid decimal value", "Error", JOptionPane.ERROR_MESSAGE);
    return false;
}

    }
}
