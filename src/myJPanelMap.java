import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class myJPanelMap extends JPanel implements ActionListener {
    JButton beaver,behrend, upark, wbarre, brandywine, menu;
        
    public myJPanelMap() {
        setLayout(null);
        setBackground(Color.orange);
        
            //Buttons!    
        //beaver
        beaver = new JButton("Beaver");
        add(beaver);
        beaver.setBounds(new Rectangle(50,50,175,50));
        //behrend
        behrend = new JButton("Behrend");
        add(behrend);
        behrend.setBounds(new Rectangle(250,50,175,50));
        //upark
        upark = new JButton("University Park");
        add(upark);
        upark.setBounds(new Rectangle(250,170,175,50));
        //wbarre
        wbarre = new JButton("Wilkes-Barre");
        add(wbarre);
        wbarre.setBounds(new Rectangle(250,300,175,50));
        //brandywine
        brandywine = new JButton("Brandywine");
        add(brandywine);
        brandywine.setBounds(new Rectangle(50,300,175,50));
                
            //panels
        //add(pbeaver);
        /*
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
        add(brandywine);*/        
    }
}
