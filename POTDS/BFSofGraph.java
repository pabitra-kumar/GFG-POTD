import java.util.*;

public class BFSofGraph {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        int numNodes = adj.size();
        boolean[] visited = new boolean[numNodes];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int u = q.remove();
            list.add(u);

            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        return list;
    }

}