import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class myJPanel extends JPanel implements ActionListener {
    
    JButton map;
    
    myJPanelMap pmap;
   
    public myJPanel() {
        
        add(map);
        map.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event) {
        
        Object obj = event.getSource();
        
        if (obj == map) {  
           remove(myJPanel);
           add(pmap);
           validate();
           repaint();
    }
    
        if (obj == pmap.menu) {
           remove(pmap);
           add(myJPanel);
           validate();
           repaint();
    }
}

}
