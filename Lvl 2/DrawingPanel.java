import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel{
    
    DrawingPanel(){

        this.setPreferredSize(new Dimension(500, 500));
    }

    //The following paint function draws elements to form a face
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        //face circle
        g2D.setColor(Color.pink);
        g2D.fillOval(100, 100, 300, 300);
        
    }


}