
import javax.swing.JTextField;


public class CalcClass {
    
    public boolean beginning_zero;
    public boolean having_decpoint;
   
    
    public void write_number (String num, JTextField display) {
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + num);
        beginning_zero = true; 
    }
    
    public void mr (JTextField display, JTextField memory_display) {
        display.setText(String.valueOf(memory_display.getText()));
    }
    
    public void mc (JTextField memory_display) {
        memory_display.setText(null);
    }
    
    public void ms (JTextField display, JTextField memory_display) {
        memory_display.setText(String.valueOf(display.getText()));
    }
}
