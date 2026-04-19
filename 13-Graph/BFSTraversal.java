import java.util.*;
public class BFSTraversal {
    private LinkedList<Integer> adjacency[];
    BFSTraversal(int v){
        adjacency=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adjacency[v].add(w);
    }
    void BFS(int source){
        boolean[] visited=new boolean[adjacency.length];
        int parent []=new int [adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        parent[source]=-1;
        visited[source]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            System.out.print(p+" ");
            for(int i:adjacency[p]){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                    parent[i]=p;
                }
            }

        }
    }
    public static void main(String[] args) {
        BFSTraversal g=new BFSTraversal(5);
        g.addEdge(0,1 );
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.println("BFS traversal starting from node 0:");
        g.BFS(0);

    }
}
