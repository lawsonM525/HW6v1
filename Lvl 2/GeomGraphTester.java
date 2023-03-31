// Tester for GeomGraph.java
import java.awt.*;
import javax.swing.*;

public class GeomGraphTester extends JPanel {
    
    public void addVertexTester(){
        System.out.println("TESTING ADDVERTEX");
        GeomGraph g = new GeomGraph();
        System.out.println("Graph = " + g.toString());  
        System.out.println("Adding vertex A");
        g.addVertex("A");
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding vertex B");
        g.addVertex("B");
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding vertex C");
        g.addVertex("C");
        System.out.println("Graph = " + g.toString());
    }

    public void addEdgeTester(){
        System.out.println("TESTING ADDEDGE");
        GeomGraph g = new GeomGraph();
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding vertices A, B and C");
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge A-B");
        g.addEdge(0, 1);
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge B-C");
        g.addEdge(1, 2);
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge C-A");
        g.addEdge(2, 0);
        System.out.println(g.toString());
    }

    public static void main(String[] args) {
        GeomGraphTester gt = new GeomGraphTester();
        System.out.println(" STARTING TESTS ");
        System.out.println("");
        gt.addVertexTester();
        System.out.println("");
        gt.addEdgeTester();
        System.out.println("");
        System.out.println(" ENDING TESTS ");
    }
}
