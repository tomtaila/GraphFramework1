package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 26/11/2013
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */
public class Vertex {

//    HashMap<Vertex, Integer> adjVertices;
    private List<Edge> incidentEdges;
    private String name;

    public Vertex(String name)
    {
//        adjVertices = new HashMap<Vertex, Integer>();
        incidentEdges = new LinkedList<Edge>();
        this.name = name;
    }

    public List<Edge> incidentEdges() {
        return incidentEdges;
    }

    public String getName() {
        return name;
    }

    public boolean addEdge(Edge e) {
        if(!incidentEdges.contains(e) && e.startingVertex().equals(this))
        {
            return incidentEdges.add(e);
        }
        else return false;
    }

    public boolean removeEdge(Edge e) {
        return incidentEdges.remove(e);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Vertex)
        {
            Vertex arg = (Vertex) obj;
            if(arg.name.equals(name)) return true;
            else return false;
        }
        else return false;
    }

    @Override
    public String toString()
    {
        return name + "\t" + incidentEdges.toString();
    }

}
