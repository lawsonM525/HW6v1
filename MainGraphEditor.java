import java.util.Scanner;

public class MainGraphEditor {

    public static void main(String[] args) {
        GeomGraph ggraph = new GeomGraph();
        DrawingFrame frame = new DrawingFrame(ggraph);

        //run loop to continuously ask for input
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a command: ");
            String input = sc.nextLine();
            String[] tokens = input.split(" ");

            if (tokens[0].equals("addVertex")) {
                ggraph.addVertex(tokens[1]);
            } else if (tokens[0].equals("addEdge")) {
                int v1 = Integer.parseInt(tokens[1]);
                int v2 = Integer.parseInt(tokens[2]);
                ggraph.addEdge(v1, v2);
            } else if (tokens[0].equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }



        sc.close();

    }
    
}
