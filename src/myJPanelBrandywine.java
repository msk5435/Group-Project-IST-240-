import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelBrandywine extends JPanel {
    
    JButton SubmitBrandywine;
    
    public myJPanelBrandywine() {
        
        super();
        setBackground(Color.red);
        SubmitBrandywine = new JButton("Submit Brandywine Quiz");
        add(SubmitBrandywine);
    }
    
}
