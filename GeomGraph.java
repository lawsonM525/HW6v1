import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import Graph.Graph;

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

        //draw line between vertex points
        

    }

    
}
