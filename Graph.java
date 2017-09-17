import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ulti72 on 13/9/17.
 */
public class Graph {

    private Map<Integer,ArrayList<Integer>> adjListsMap=new HashMap<>() ;  //adjListsMap stores Graph.
    private int numVertices =0;                                           
    private int numEdges=0;

    public  int getNumVertices(){
        return numVertices;
    }
    public  int getNumEdges(){
        return numEdges;
    }

    public int addVertex(){
        int v =getNumVertices();
        ArrayList<Integer> neighbors = new ArrayList<>();
        adjListsMap.put(v,neighbors);
        numVertices++;
        return (numVertices-1);
    }

    public void addEdge(int v , int w){
        numEdges++;
        if(v<numVertices && w<numVertices){
        (adjListsMap.get(v)).add(w);}
        else{
            throw new IndexOutOfBoundsException();
        }

    }
    public List<Integer> getNeighbours(int v)
    {
        return new ArrayList<Integer>(adjListsMap.get(v));
    }

    public List<Integer> getInNeighbours(int v){
        List<Integer> inNeighbors = new ArrayList<>();
        for(int u:adjListsMap.keySet()){
            for(int w:adjListsMap.get(u)){
                if(v==w){
                    inNeighbors.add(u);
                }
            }
        }
        return inNeighbors;
    }



}
