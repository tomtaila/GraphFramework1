package graph.edgeModificationBehaviours;


import graph.Edge;
import graph.WeightedEdge;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 30/11/2013
 * Time: 01:45
 * To change this template use File | Settings | File Templates.
 */
public class WeightedDigraphGraphEdgeModificationBehaviour implements GraphEdgeModificationBehaviour {
    @Override
    public boolean addEdge(Edge e) {
        if(e instanceof WeightedEdge)
        {
            WeightedEdge weightedEdge = (WeightedEdge) e;
            return e.startingVertex().addEdge(weightedEdge);
        }
        else return false;
    }

    @Override
    public boolean removeEdge(Edge e) {
        if(e instanceof WeightedEdge)
        {
            WeightedEdge weightedEdge = (WeightedEdge) e;
            return e.startingVertex().removeEdge(weightedEdge);
        }
        else return false;
    }
}
