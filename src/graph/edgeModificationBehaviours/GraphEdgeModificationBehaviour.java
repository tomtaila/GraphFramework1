package graph.edgeModificationBehaviours;

import graph.Edge;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 29/11/2013
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public interface GraphEdgeModificationBehaviour {
    public boolean addEdge(Edge e);
    public boolean removeEdge(Edge e);
}
