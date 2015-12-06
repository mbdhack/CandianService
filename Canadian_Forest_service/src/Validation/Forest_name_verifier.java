
package Validation;

import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Davy
 */
public class Forest_name_verifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText().trim();
        
        if(text==null)
            return false;
        else
        {
            Pattern pattern = Pattern.compile("^\\p{L}+(?: \\p{L}+)*$");
             if (pattern.matcher(text).matches())
                 return true;
             else
                 return false;
        }
        
    }
    
}
