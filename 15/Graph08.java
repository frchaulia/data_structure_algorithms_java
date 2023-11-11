package J15;

public class Graph08 {
    int vertex;
    LinkedList08 list[];

    public Graph08(int vertex){
        this.vertex = vertex;
        list = new LinkedList08[vertex];
        for(int i = 0; i<vertex; i++){
            list[i] = new LinkedList08();
        }
    }

    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source){
        System.out.println("degree of vertex" +source+ " : " +list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for(int i=0; i<vertex; i++){
            for(int j=0; j<list[i].size(); j++){
                if(list[i].get(j)==source)
                    ++totalIn;
            }
            for(k=0; k<list[source].size();k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree of vertex" +source+ ":" +totalIn);
        System.out.println("Outdegree of vertex" +source+ ":" +totalOut);
        System.out.println("Degree of vertex" +source+ " : " + (totalIn+totalOut));
    }

    public void removeEdge(int source, int destination){
        for (int i=0; i<vertex; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges(){
        for (int i=0;i<vertex;i++){
            list[i].clear();
        }
        System.out.println("Graph successfully emptied");
    }

    public void printGraph(){
        for (int i=0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.println("Vertex " +i+ "connected with : ");
                for (int j=0, j<list[i].size(); j++){
                    System.out.println(list[i].get(j) + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    
}
