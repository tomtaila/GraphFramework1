package graph.edgeModificationBehaviours;

import graph.Edge;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 29/11/2013
 * Time: 17:37
 * To change this template use File | Settings | File Templates.
 */
public class NonWeightedGraphGraphEdgeModificationBehaviour implements GraphEdgeModificationBehaviour {
    @Override
    public boolean addEdge(Edge e)
    {
        Edge reverseEdge = new Edge(e);
        reverseEdge.setStartingVertex(e.destinationVertex());
        reverseEdge.setDestinationVertex(e.startingVertex());
        return e.startingVertex().addEdge(e) && e.destinationVertex().addEdge(reverseEdge);
    }

    @Override
    public boolean removeEdge(Edge e)
    {
        Edge reverseEdge = new Edge(e);
        reverseEdge.setStartingVertex(e.destinationVertex());
        reverseEdge.setDestinationVertex(e.startingVertex());
        return e.startingVertex().removeEdge(e) && e.destinationVertex().removeEdge(reverseEdge);
    }
}
