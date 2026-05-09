public class Experiment {

    public void runTraversals(Graph g) {
        System.out.println("BFS:");
        long start = System.nanoTime();
        g.bfs(1);
        long end = System.nanoTime();
        System.out.println("BFS Time: " + (end - start) + " ns");

        System.out.println("DFS:");
        start = System.nanoTime();
        g.dfs(1);
        end = System.nanoTime();
        System.out.println("DFS Time: " + (end - start) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\nGraph size: " + size);

            Graph g = new Graph();

            for (int i = 1; i <= size; i++) {
                g.addVertex(new Vertex(i));
            }

            // simple edges
            for (int i = 1; i < size; i++) {
                g.addEdge(i, i + 1);
            }

            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("Experiments completed.");
    }
}