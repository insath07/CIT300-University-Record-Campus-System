package graph;

import java.util.*;

public class CampusGraph {

    private Map<String, List<Edge>> adjacencyList;

    private class Edge {
        String destination;
        int distance;

        Edge(String destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    public CampusGraph() {
        adjacencyList = new HashMap<>();
    }

    // Add a campus location
    public void addLocation(String location) {

        if (!adjacencyList.containsKey(location)) {
            adjacencyList.put(location, new ArrayList<>());
            System.out.println("Location added: " + location);
        }
    }

    // Add an undirected route
    public void addRoute(String location1, String location2, int distance) {

        if (!adjacencyList.containsKey(location1)) {
            addLocation(location1);
        }

        if (!adjacencyList.containsKey(location2)) {
            addLocation(location2);
        }

        adjacencyList.get(location1)
                .add(new Edge(location2, distance));

        adjacencyList.get(location2)
                .add(new Edge(location1, distance));

        System.out.println(
                "Route added: " + location1
                + " <-> " + location2
                + " (" + distance + " m)"
        );
    }

    // Display graph
    public void displayGraph() {

        System.out.println("\n===== Campus Route Graph =====");

        for (String location : adjacencyList.keySet()) {

            System.out.print(location + " -> ");

            List<Edge> edges = adjacencyList.get(location);

            for (Edge edge : edges) {

                System.out.print(
                        edge.destination
                        + " (" + edge.distance + " m)"
                );

                System.out.print(" | ");
            }

            System.out.println();
        }

        System.out.println("==============================\n");
    }

    // Breadth First Search
    public void bfs(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Starting location not found.");
            return;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("\n===== BFS Traversal =====");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " -> ");

            for (Edge edge : adjacencyList.get(current)) {

                if (!visited.contains(edge.destination)) {

                    visited.add(edge.destination);
                    queue.add(edge.destination);
                }
            }
        }

        System.out.println("END");
        System.out.println("=========================\n");
    }

    // Depth First Search
    public void dfs(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Starting location not found.");
            return;
        }

        Set<String> visited = new HashSet<>();

        System.out.println("\n===== DFS Traversal =====");

        dfsRecursive(start, visited);

        System.out.println("END");
        System.out.println("=========================\n");
    }

    private void dfsRecursive(
            String current,
            Set<String> visited) {

        visited.add(current);

        System.out.print(current + " -> ");

        for (Edge edge : adjacencyList.get(current)) {

            if (!visited.contains(edge.destination)) {

                dfsRecursive(edge.destination, visited);
            }
        }
    }

    // Dijkstra's shortest path
    public void shortestPath(String start, String destination) {

        if (!adjacencyList.containsKey(start)
                || !adjacencyList.containsKey(destination)) {

            System.out.println("Location not found.");
            return;
        }

        Map<String, Integer> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();

        for (String location : adjacencyList.keySet()) {
            distance.put(location, Integer.MAX_VALUE);
        }

        distance.put(start, 0);

        PriorityQueue<String> priorityQueue =
                new PriorityQueue<>(
                        Comparator.comparingInt(distance::get)
                );

        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()) {

            String current = priorityQueue.poll();

            for (Edge edge : adjacencyList.get(current)) {

                int newDistance =
                        distance.get(current) + edge.distance;

                if (newDistance < distance.get(edge.destination)) {

                    distance.put(edge.destination, newDistance);
                    previous.put(edge.destination, current);

                    priorityQueue.remove(edge.destination);
                    priorityQueue.add(edge.destination);
                }
            }
        }

        if (distance.get(destination) == Integer.MAX_VALUE) {

            System.out.println(
                    "No route available from "
                    + start + " to " + destination
            );

            return;
        }

        List<String> path = new ArrayList<>();

        String current = destination;

        while (current != null) {

            path.add(current);
            current = previous.get(current);
        }

        Collections.reverse(path);

        System.out.println("\n===== Shortest Path =====");

        System.out.println(
                "From: " + start
                + " To: " + destination
        );

        System.out.println(
                "Distance: "
                + distance.get(destination)
                + " m"
        );

        System.out.println(
                "Path: " + String.join(" -> ", path)
        );

        System.out.println("=========================\n");
    }

    public boolean containsLocation(String location) {
        return adjacencyList.containsKey(location);
    }

    public boolean isEmpty() {
        return adjacencyList.isEmpty();
    }
}