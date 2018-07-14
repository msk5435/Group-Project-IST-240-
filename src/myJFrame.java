import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class myJFrame extends JFrame
{

    public myJFrame()
    {
        super("Lab 08");
        LayoutSetupMAC();
        myJPanel inp = new myJPanel();
        add(inp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 280);
        setVisible(true);
    }

    void LayoutSetupMAC()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }

}
