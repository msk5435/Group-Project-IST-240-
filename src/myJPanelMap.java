import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class myJPanelMap extends JPanel implements ActionListener {
    
    JButton beaver,behrend, upark, wbarre, brandywine, menu;
    
        myJPanelBeaver pbeaver;
        myJPanelBehrend pbehrend;
        myJPanelUpark pupark;
        myJPanelWbarre pwbarre;
        myJPanelBrandywine pbrandywine;
        myJPanel menupanel;
        
        
        
    public myJPanelMap() {
        
        pbeaver = new myJPanelBeaver();
        pbeaver.SubmitBeaver.addActionListener(this);
        add(pbeaver);
        
        pbehrend = new myJPanelBehrend();
        pbehrend.SubmitBehrend.addActionListener(this);
        add(pbehrend);
        
        pupark = new myJPanelUpark();
        pupark.SubmitUpark.addActionListener(this);
        add(pupark);
        
        pwbarre = new myJPanelWbarre();
        pwbarre.SubmitWbarre.addActionListener(this);
        add(pwbarre);
        
        pbrandywine = new myJPanelBrandywine();
        pbrandywine.SubmitBrandywine.addActionListener(this);
        add(pbrandywine);
        
        
        beaver = new JButton("Beaver");
        behrend = new JButton("Behrend");
        upark = new JButton("University Park");
        wbarre = new JButton("Wilkes-Barre");
        brandywine = new JButton("Brandywine");
        
        setLayout(null);
        
        menu.addActionListener(this);
        add(menu);
        beaver.addActionListener(this);
        add(beaver);
        behrend.addActionListener(this);
        add(behrend);
        upark.addActionListener(this);
        add(upark);
        wbarre.addActionListener(this);
        add(wbarre);
        brandywine.addActionListener(this);
        add(brandywine);
        
        
        //x,y,length, height
        beaver.setBounds(new Rectangle(50,100,75,50));
        behrend.setBounds(new Rectangle(50,50,75,50));
        upark.setBounds(new Rectangle(75,75,75,50));
        wbarre.setBounds(new Rectangle(100,50,75,50));
        brandywine.setBounds(new Rectangle(100,100,75,50));
    }
        
    public void actionPerformed(ActionEvent event) {
        
        Object obj = event.getSource();
        
        if (obj == beaver) {  
           add(pbeaver);
           validate();
           repaint();
    }
    
        if (obj == pbeaver.SubmitBeaver) {
           remove(pbeaver);
           validate();
           repaint();
    }
        
    }
    
}
