
import java.util.*;
public class DFSTraversal {
    private LinkedList<Integer> adjacency[];
    DFSTraversal(int v){
        adjacency=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<>();
        }
    }
    public void addEdge(int v,int w){
        adjacency[v].add(w);
    }
    public void DFSUtil(int node,boolean[] visited){
        visited[node]=true;
        System.out.print(node+" ");
        for(int i:adjacency[node]){
            if(!visited[i]){
                DFSUtil(i, visited);
            }
        }
    }
    void DFS(int source){
        boolean[] visited=new boolean[adjacency.length];
        DFSUtil(source, visited);
    }
     public static void main(String[] args) {
        DFSTraversal g = new DFSTraversal(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.println("DFS traversal starting from node 0:");
        g.DFS(0);
    }
}
