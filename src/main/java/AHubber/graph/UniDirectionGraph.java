package AHubber.graph;

import epam.Inte;

import java.util.LinkedList;
import java.util.Queue;

//Adjacency List Representation of an Undirected Graph in Java | Animation
public class UniDirectionGraph {

    private int V;  //number of vertices in graph
    private int E; // number of edges in graph

    private LinkedList<Integer> adj[];

    public UniDirectionGraph(int nodes){
        this.V = nodes;
        this.E=0;
        this.adj = new LinkedList[nodes];
        for(int v=0;v<V;v++){
            adj[v] = new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public static void main(String[] args) {
        UniDirectionGraph graph = new UniDirectionGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(2,4);
        graph.bfs(0);
        //System.out.println(graph);
    }
    public void bfs(int s){
        boolean[] visited  = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print (u+" ");
            for(int v: adj[u]){
                if(!visited[v]){
                    visited[v]= true;
                    q.offer(v);
                }
            }
        }
    }
    public String toString(){
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(V+" Vertices "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            stringBuilder.append(v+" :");
            for(int w: adj[v]){
                stringBuilder.append(w+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
}
