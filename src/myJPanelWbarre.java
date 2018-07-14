import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelWbarre extends JPanel {
    
    JButton SubmitWbarre;
    
    public myJPanelWbarre() {
        
        super();
        setBackground(Color.blue);
        SubmitWbarre = new JButton("Submit Wilkes-Barre Quiz");
        add(SubmitWbarre);
    }
    
}
