package AHubber.graph;

public class Graph {
    private int[][] adjMatrix;
    private int V;  // number of Vertices in Graph
    private int E; //number of edges in Graph

    public Graph(int nodes){
        this.V= nodes;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];
    }
    public void addEdge(int u, int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }

    public String toString(){
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(V+" Vertices "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            stringBuilder.append(v+" :");
            for(int w: adjMatrix[v]){
                stringBuilder.append(w+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        System.out.println(graph);
    }



}
