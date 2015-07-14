
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
    
    public void clear (JTextField display, JTextField display2) {
        display.setText("0");
        display2.setText(null);
    }
    
    public void one_divide_x (double number2, double result, JTextField display, JTextField display2){
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = 1/number2;
        
        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
                
        display2.setText("1/" + String.valueOf(number2));
        result = 0;
    }
    
    public void sqrt (double number2, double result, JTextField display, JTextField display2) {
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = Math.sqrt(number2);

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        display2.setText("√" + String.valueOf(number2));
        result = 0;
    }
 
}
