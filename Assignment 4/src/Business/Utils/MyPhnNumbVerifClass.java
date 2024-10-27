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
public class MyPhnNumbVerifClass extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
String text = ((JTextField) input).getText();
String pattern = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";

if (!text.matches(pattern)) {
    input.setBackground(Color.red);
    JOptionPane.showMessageDialog(input, "Please enter a valid Phone Number.", "Error", JOptionPane.ERROR_MESSAGE);
    return false;
}

if (text.isEmpty()) {
    input.setBackground(Color.red);
    return false;
}

input.setBackground(Color.white);
return true;

    }
}
