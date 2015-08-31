
import javax.swing.JTextField;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class Calculator {
    
    public boolean beginsWithZero;
    public boolean hasDecimalPoint;
    
    public byte operator;
    
    public double number1;
    public double number2;
    public double result;
   
    
    public void writeNumber (String num, JTextField display) {
        if(!beginsWithZero && !hasDecimalPoint) {
            display.setText(null);
        }
        display.setText(display.getText() + num);
        beginsWithZero = true; 
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
    
    public void oneDivideX (double number2, double result, JTextField display, JTextField display2){
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = 1/number2;
        
        if(number2 == 0){
            display.setText("0");
            display2.setText("Error!");
        }
        
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
 
    public void backspace(JTextField display){
        if(display.getText().length() > 0){
            display.setText(display.getText().substring(0,display.getText().length() - 1));
        }
    }
    
    public void copy(JTextField display){
        String myString = display.getSelectedText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
    
    public void addCutCopyPastePopUp(JTextField textComponent) {
   ActionMap am = textComponent.getActionMap();
   Action paste = am.get("paste-from-clipboard");
   Action copy = am.get("copy-to-clipboard");
   Action cut = am.get("cut-to-clipboard");

   cut.putValue(Action.NAME, "Cut");
   copy.putValue(Action.NAME, "Copy");
   paste.putValue(Action.NAME, "Paste");

   JPopupMenu popup = new JPopupMenu("My Popup");
   textComponent.setComponentPopupMenu(popup);
   popup.add(new JMenuItem(cut));
   popup.add(new JMenuItem(copy));
   popup.add(new JMenuItem(paste));
}
 
}
