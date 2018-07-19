import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelBrandywine extends JPanel {
    JButton FIRST_THEME, SECOND_THEME, THIRD_THEME, home;
    
    public myJPanelBrandywine () { 
        super();
        setLayout(null);
        setBackground(Color.red);        
        
        FIRST_THEME = new JButton("Theme 1");
        add(FIRST_THEME);
        FIRST_THEME.setBounds(new Rectangle(50, 50, 175, 75));
        
        SECOND_THEME = new JButton("Theme 2");
        add(SECOND_THEME);
        SECOND_THEME.setBounds(new Rectangle(50, 150, 175, 75));
        
        THIRD_THEME = new JButton("Theme 3");
        add(THIRD_THEME);
        THIRD_THEME.setBounds(new Rectangle(50, 250, 175, 75));
        
        home = new JButton("HOME");
        add(home);
        home.setBounds(new Rectangle(50, 350, 175, 75));
    }    
}
