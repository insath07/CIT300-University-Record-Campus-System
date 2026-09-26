import graph.CampusGraph;

public class GraphMain {

    public static void main(String[] args) {

        CampusGraph graph = new CampusGraph();

        System.out.println("=================================");
        System.out.println(" CAMPUS ROUTE MANAGEMENT SYSTEM");
        System.out.println(" Graph Module - Member 4");
        System.out.println(" A.L.M. Arshad - 23DA2");
        System.out.println("=================================\n");

        System.out.println("1. Add Campus Locations");

        graph.addLocation("Main Gate");
        graph.addLocation("Library");
        graph.addLocation("Science Block");
        graph.addLocation("Computer Lab");
        graph.addLocation("Cafeteria");

        System.out.println("\n2. Add Campus Routes");

        graph.addRoute("Main Gate", "Library", 200);
        graph.addRoute("Main Gate", "Science Block", 300);
        graph.addRoute("Library", "Computer Lab", 150);
        graph.addRoute("Library", "Cafeteria", 100);
        graph.addRoute("Science Block", "Computer Lab", 120);
        graph.addRoute("Computer Lab", "Cafeteria", 80);

        System.out.println("\n3. Display Graph");

        graph.displayGraph();

        System.out.println("4. BFS Traversal");

        graph.bfs("Main Gate");

        System.out.println("5. DFS Traversal");

        graph.dfs("Main Gate");

        System.out.println("6. Shortest Path");

        graph.shortestPath("Main Gate", "Cafeteria");

        System.out.println("7. Search Location");

        System.out.println(
                "Library exists? "
                + graph.containsLocation("Library")
        );

        System.out.println(
                "Hostel exists? "
                + graph.containsLocation("Hostel")
        );

        System.out.println("\n8. Check Graph");

        System.out.println(
                "Is Graph Empty? "
                + graph.isEmpty()
        );

        System.out.println("\n=================================");
        System.out.println(" Graph Testing Completed");
        System.out.println("=================================");
    }
}