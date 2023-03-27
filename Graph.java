// This is a graphical representation of a graph using a group of vertices and edges.

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices = new ArrayList<Vertex>();   
    ArrayList<Edge> edges = new ArrayList<Edge>();
    
    public Graph() {
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

}
