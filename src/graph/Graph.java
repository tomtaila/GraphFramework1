package graph;

import graph.edgeModificationBehaviours.GraphEdgeModificationBehaviour;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 28/11/2013
 * Time: 17:37
 * To change this template use File | Settings | File Templates.
 */
public class Graph {

    protected LinkedList<Vertex> vertices;
    protected GraphEdgeModificationBehaviour graphEdgeModificationBehaviour;

    public Graph(GraphEdgeModificationBehaviour graphEdgeModificationBehaviour)
    {
        vertices = new LinkedList<Vertex>();
        this.graphEdgeModificationBehaviour = graphEdgeModificationBehaviour;
    }

    public void setVertices(LinkedList<Vertex> vertexList)
    {
        vertices = vertexList;
    }

    public LinkedList<Vertex> getVertices()
    {
        return vertices;
    }

    public boolean addVertex(Vertex v) {
        if(vertices.contains(v))
        {
            System.out.println("Vertex already exists");
            return false;
        }
        else return vertices.add(v);
    }

    public boolean removeVertex(Vertex v) {
        return vertices.remove(v);
    }

    public boolean addEdge(Edge e)
    {
        return graphEdgeModificationBehaviour.addEdge(e);
    }

    public boolean removeEdge(Edge e)
    {
        return graphEdgeModificationBehaviour.removeEdge(e);
    }
}
