# Graph
TO CREATE A GRAPH IN JAVA, INHERIT THE GRAPH.Java file in your class.
public class ur_class_name extends Graph{
    public static void main(String[] args){
       ur_class_name obj = new ur_class_name();
       }

}

*METHODS---[call it on your class object][creating an object obj]
1. FOR ADDING VERTEX
obj.addVertex(); //will add an vertex starting from 0

2. FOR ADDING EDGE
obj.addEdge(int v, int w ); //will add an edge between v and w 

3.NUMBER OF EDGES
obj.getNumbVertices()

4. NUMBER OF VERTEX
obj.getNumEdges()

5.GETTING NEIGHBOURS OF A VERTEX
obj.getInNeighbours(int v)  // will return list of neighbours of vertex v
