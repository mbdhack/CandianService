
package Validation;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Davy
 */
public class Number_of_years extends InputVerifier{

    @Override
   public boolean verify(JComponent input) {
         String text = ((JTextField) input).getText();
        if(text==null)
            return false;
        else
        return text.matches("^[1-9]+[0-9]*$");
    }
    
}
