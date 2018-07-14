import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelBehrend extends JPanel {
    
    JButton SubmitBehrend;
    
    public myJPanelBehrend () {
        
        super();
        setBackground(Color.darkGray);
        SubmitBehrend = new JButton("Submit Behrend Quiz");
        add(SubmitBehrend);
    }
    
}
