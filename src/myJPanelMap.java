import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelMap extends JPanel implements ActionListener {
    
    JButton beaver,behrend, upark, wbarre, brandywine, menu;
        
    public myJPanelMap() {
        setLayout(null);
        setBackground(Color.orange);
        
        
            //Buttons!    
        //beaver
        beaver = new JButton("Beaver");
        add(beaver);
        beaver.setBounds(new Rectangle(120,390,175,50));
        //behrend
        behrend = new JButton("Behrend");
        add(behrend);
        behrend.setBounds(new Rectangle(30,160,175,50));
        //upark
        upark = new JButton("University Park");
        add(upark);
        upark.setBounds(new Rectangle(360,300,175,50));
        //wbarre
        wbarre = new JButton("Wilkes-Barre");
        add(wbarre);
        wbarre.setBounds(new Rectangle(580,240,175,50));
        //brandywine
        brandywine = new JButton("Brandywine");
        add(brandywine);
        brandywine.setBounds(new Rectangle(690,440,175,50));
       
        //Icon iconmap = new ImageIcon(map);
        //jlBackgroundImage = new JLabel(iconmap);
        //jlBackgroundImage.setBounds(0,0,500,300);
         
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
   public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("map-penn.jpg");
    	g.drawImage(myImage, 0, 0, this);    	
       
      

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
