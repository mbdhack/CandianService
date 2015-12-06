
package Validation;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Davy
 */
public class Forest_growth_verifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
         String text = ((JTextField) input).getText();
        if(text==null)
            return false;
        else
        return text.matches("^\\s*(?=.*[1-9])\\d*(?:\\.\\d{1,2})?\\s*$");
    }
    
}
