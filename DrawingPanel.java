import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {
    ArrayList<Point> points;
    ArrayList<Edge> edges;


    public DrawingPanel(GeomGraph ggraph) {
        this.setBackground(Color.WHITE);
        this.points = ggraph.points;
        this.edges = ggraph.edges;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        //draw points
        for (Point p : points) {
            p.drawPoint(g);
        }

        //draw edges
        for (Edge e : edges) {
            Point p1 = points.get(e.getV1());
            Point p2 = points.get(e.getV2());
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}