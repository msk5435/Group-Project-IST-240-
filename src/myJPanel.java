import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class myJPanel extends JPanel implements ActionListener {
    //panels
    myJPanelMap pmap;
    myJPanelBeaver pBeaver;
    myJPanelBehrend pBehr;
    myJPanelUpark pUpark;
    myJPanelWbarre pWBarre;
    myJPanelBrandywine pBrand;
    
    public myJPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.gray);
           
        //map panel
        pmap = new myJPanelMap();
        //pmap button listeners
        pmap.beaver.addActionListener(this);
        pmap.behrend.addActionListener(this);
        pmap.upark.addActionListener(this);
        pmap.wbarre.addActionListener(this);
        pmap.brandywine.addActionListener(this);
        add(pmap, "Center");
        
        //beaver panel
        pBeaver = new myJPanelBeaver();
        pBeaver.FIRST_THEME.addActionListener(this);
        pBeaver.home.addActionListener(this);        
        //brehend panel        
        pBehr = new myJPanelBehrend();
        pBehr.FIRST_THEME.addActionListener(this);
        pBehr.home.addActionListener(this);        
        //upark panel        
        pUpark = new myJPanelUpark();
        pUpark.FIRST_THEME.addActionListener(this);
        pUpark.home.addActionListener(this);        
        //wbarre panel        
        pWBarre = new myJPanelWbarre();
        pWBarre.FIRST_THEME.addActionListener(this);
        pWBarre.home.addActionListener(this);      
        //brandywine panel        
        pBrand = new myJPanelBrandywine();
        pBrand.FIRST_THEME.addActionListener(this);
        pBrand.home.addActionListener(this);        
    }    
    
    public void actionPerformed(ActionEvent event) {        
        Object obj = event.getSource();
        
        //CAMPUS BUTTONS
        if (obj == pmap.beaver) {   //pmap -- beaver button
           remove(pmap);
           add(pBeaver, "Center");
           validate();
           repaint();
        } 
        if (obj == pmap.behrend) {   //pmap -- brehend button
           remove(pmap);
           add(pBehr, "Center");
           validate();
           repaint();
        }
        if (obj == pmap.upark) {   //pmap -- upark button
           remove(pmap);
           add(pUpark, "Center");
           validate();
           repaint();
        }    
        if (obj == pmap.wbarre) {   //pmap -- wbarre button
           remove(pmap);
           add(pWBarre, "Center");
           validate();
           repaint();
        }
        if (obj == pmap.brandywine) {   //pmap -- brandywine button
           remove(pmap);
           add(pBrand, "Center");
           validate();
           repaint();
        }    
        //-------------------------------------------------------------------//
        //HOME BUTTONS
        if (obj == pBeaver.home) {  //pBeaver -- home button
           remove(pBeaver);
           add(pmap);
           validate();
           repaint();
        }
        if (obj == pBehr.home) {  //pBehr -- home button
           remove(pBehr);
           add(pmap);
           validate();
           repaint();
        }
        if (obj == pUpark.home) {  //pUpark -- home button
           remove(pUpark);
           add(pmap);
           validate();
           repaint();
        }
        if (obj == pWBarre.home) {  //pWBarre -- home button
           remove(pWBarre);
           add(pmap);
           validate();
           repaint();
        }
        if (obj == pBrand.home) {  //pBrand -- home button
           remove(pBrand);
           add(pmap);
           validate();
           repaint();
        }
    }
}
