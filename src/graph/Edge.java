package graph;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 26/11/2013
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class Edge {

    protected Vertex startV;
    protected Vertex destV;

    public Edge(Vertex startV, Vertex destV) {
        this.startV = startV;
        this.destV = destV;
    }

    public Edge(Edge e)
    {
        this.startV = e.startV;
        this.destV = e.destV;
    }

    public Vertex startingVertex() {
        return startV;
    }

    public Vertex destinationVertex() {
        return destV;
    }

    public void setStartingVertex(Vertex startingVertex) {
        startV = startingVertex;
    }

    public void setDestinationVertex(Vertex destinationVertex) {
        destV = destinationVertex;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Edge)
        {
            Edge arg = (Edge) obj;
            if((arg.startV.equals(startV) && arg.destV.equals(destV))) return true;
            else return false;
        }
        else return false;
    }

    @Override
    public String toString()
    {
        return startV.getName() + "--" + destV.getName();
    }

}
