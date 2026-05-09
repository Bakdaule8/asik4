public class Main {
    public static void main(String[] args) {

        Graph smallGraph = new Graph();

        // 10 vertices
        for (int i = 1; i <= 10; i++) {
            smallGraph.addVertex(new Vertex(i));
        }

        // edges
        smallGraph.addEdge(1, 2);
        smallGraph.addEdge(1, 3);
        smallGraph.addEdge(2, 4);
        smallGraph.addEdge(3, 5);
        smallGraph.addEdge(4, 6);
        smallGraph.addEdge(5, 7);

        System.out.println("Small Graph:");
        smallGraph.printGraph();

        Experiment exp = new Experiment();

        System.out.println("\nTraversal on Small Graph:");
        exp.runTraversals(smallGraph);

        System.out.println("\nRunning multiple tests:");
        exp.runMultipleTests();
    }
}