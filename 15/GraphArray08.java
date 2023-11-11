package J15;

import java.util.Scanner;

public class GraphArray08 {
    private final int vertices;
    private int[][] twoD_array;

    public GraphArray08(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge){
        try{
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex does not exist");
        }
    }

    public int getEdge(int to, int from){
        try{
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex does not exist");
        }
        return -1;
    }

    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray08 graph;
        try{
            System.out.println("How many vertices? : ");
            v = sc.nextInt();
            System.out.println("How many edges? : ");
            e = sc.nextInt();

            graph = new GraphArray08(v);

            System.out.println("Input edges: <to> <from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("2D array as directed graph representation: ");
            System.out.println(" ");
            for(int i=1; i<=v; i++){
                System.out.println(i + " ");
                System.out.println();
            }

            for(int i=1; i<=v; i++){
                System.out.println(i+ "");
                for (int j=1; j<=v; j++){
                    System.out.println(graph.getEdge(i, j) + " ");
                    System.out.println();
                }
            }
        }
        catch (Exception E){
            System.out.println("Error. Check again");
        }
        sc.close();
    }
}
