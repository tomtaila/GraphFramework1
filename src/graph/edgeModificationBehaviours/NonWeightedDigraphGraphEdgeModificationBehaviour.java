package graph.edgeModificationBehaviours;

import graph.Edge;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 30/11/2013
 * Time: 01:38
 * To change this template use File | Settings | File Templates.
 */
public class NonWeightedDigraphGraphEdgeModificationBehaviour implements GraphEdgeModificationBehaviour {
    @Override
    public boolean addEdge(Edge e) {
        return e.startingVertex().addEdge(e);
    }

    @Override
    public boolean removeEdge(Edge e) {
        return e.startingVertex().removeEdge(e);
    }
}
