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
    public boolean addLocation(String location) {
        if (matchingLocation(location) != null) {
            System.out.println("Location already exists.");
            return false;
        }
        adjacencyList.put(location, new ArrayList<>());
        System.out.println("Location added: " + location);
        return true;
    }

    // Add an undirected route
    public boolean addRoute(String location1, String location2, int distance) {
        if (location1.equalsIgnoreCase(location2) || distance <= 0) {
            System.out.println("A connection needs two different locations and a positive distance.");
            return false;
        }
        location1 = matchingLocation(location1);
        location2 = matchingLocation(location2);
        if (location1 == null || location2 == null) {
            System.out.println("Both locations must be added before creating a connection.");
            return false;
        }
        if (hasRoute(location1, location2)) {
            System.out.println("Connection already exists.");
            return false;
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
        return true;
    }

    public boolean removeLocation(String location) {
        location = matchingLocation(location);
        if (location == null) {
            System.out.println("Location not found.");
            return false;
        }
        adjacencyList.remove(location);
        final String locationToRemove = location;
        for (List<Edge> edges : adjacencyList.values()) {
            edges.removeIf(edge -> edge.destination.equalsIgnoreCase(locationToRemove));
        }
        System.out.println("Location and its connections removed: " + location);
        return true;
    }

    public boolean removeRoute(String location1, String location2) {
        location1 = matchingLocation(location1);
        location2 = matchingLocation(location2);
        if (location1 == null || location2 == null) {
            System.out.println("Location not found.");
            return false;
        }
        final String firstLocation = location1;
        final String secondLocation = location2;
        boolean removed = adjacencyList.get(firstLocation)
                .removeIf(edge -> edge.destination.equalsIgnoreCase(secondLocation));
        adjacencyList.get(secondLocation).removeIf(edge -> edge.destination.equalsIgnoreCase(firstLocation));
        if (!removed) {
            System.out.println("Connection not found.");
            return false;
        }
        System.out.println("Connection removed: " + location1 + " <-> " + location2);
        return true;
    }

    private boolean hasRoute(String location1, String location2) {
        for (Edge edge : adjacencyList.get(location1)) {
            if (edge.destination.equalsIgnoreCase(location2)) return true;
        }
        return false;
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
        start = matchingLocation(start);
        if (start == null) {
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
        start = matchingLocation(start);
        if (start == null) {
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
        start = matchingLocation(start);
        destination = matchingLocation(destination);
        if (start == null || destination == null) {

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
        return matchingLocation(location) != null;
    }

    private String matchingLocation(String requested) {
        for (String location : adjacencyList.keySet()) {
            if (location.equalsIgnoreCase(requested)) return location;
        }
        return null;
    }

    public boolean isEmpty() {
        return adjacencyList.isEmpty();
    }
}
