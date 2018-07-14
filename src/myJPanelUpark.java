import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelUpark extends JPanel {
    
    JButton SubmitUpark;
    
    public myJPanelUpark() {
        
        super();
        setBackground(Color.ORANGE);
        SubmitUpark = new JButton("Submit University Park Quiz");
        add(SubmitUpark);
    }
    
}
