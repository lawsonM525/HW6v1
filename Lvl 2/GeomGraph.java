import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GeomGraph extends Graph{
    public ArrayList<Point> points;
    Random rand = new Random();

    public GeomGraph() {
        super();
        points = new ArrayList<Point>();
    }  

    public void addVertex(String name) {
        super.addVertex(name);

        //make a random x and y
        int x = rand.nextInt(800);
        int y = rand.nextInt(600);

        Point p = new Point(x, y, name);
        points.add(p);
    }

    public void addEdge(int v1, int v2) {
        super.addEdge(v1, v2);
    }

    public void drawGraph(Graphics g) {
        for (Point p : points) {
            p.drawPoint(g);
        }
        for (Edge e : edges) {
            Point p1 = points.get(e.getV1());
            Point p2 = points.get(e.getV2());
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    
}
