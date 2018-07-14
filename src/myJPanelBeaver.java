import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelBeaver extends JPanel {
    
    JButton SubmitBeaver;
    
    public myJPanelBeaver () {
        
        super();
        setBackground(Color.PINK);
        SubmitBeaver = new JButton("Submit Beaver Quiz");
        add(SubmitBeaver);
    }
    
}
