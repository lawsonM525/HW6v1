import java.awt.*;
import javax.swing.*;
public class DrawingFrame  extends JFrame{
    DrawingPanel panel;

    //constructor
    public DrawingFrame(GeomGraph ggraph) {
        super("Graph Editor");
        panel = new DrawingPanel(ggraph);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
    }
    
}
