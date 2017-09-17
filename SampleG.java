/**
 * Created by ulti72 on 13/9/17.
 */
public class SampleG extends Graph {


    public static void main(String[] args){
        //create of object of the current class
        SampleG G = new SampleG();           
        //adding vertex
        G.addVertex();                        
        G.addVertex();
        G.addVertex();
        G.addVertex();
        G.addVertex();
        //adding edge
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(4,2);
        G.addEdge(1,3);                          
        //getting neighbors of vertex 2
        System.out.println(G.getInNeighbours(2));
    }


}
