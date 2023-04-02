// This class is an interactive implementation of a graph.
// The class allows the user to continuously add vertices and edges until they enter"quit" or close the window.
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        GeomGraph g = new GeomGraph();
        
        //interactive loop begins
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a command: ");
            String command = in.nextLine();
            
            if (command.equals("quit")) {
                break;
            }
            
            if (command.equals("addVertex")) {
                System.out.println("Enter a name for the vertex: ");
                String name = in.nextLine();
                g.addVertex(name);
            }
            
            if (command.equals("addEdge")) {
                System.out.println("Enter the id of the first vertex: ");
                int v1 = in.nextInt();
                System.out.println("Enter the id of the second vertex: ");
                int v2 = in.nextInt();
                g.addEdge(v1, v2);
            }
        }

        in.close();

   }
}
