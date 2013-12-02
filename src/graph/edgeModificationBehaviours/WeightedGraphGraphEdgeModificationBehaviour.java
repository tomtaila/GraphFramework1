package graph.edgeModificationBehaviours;

import graph.Edge;
import graph.WeightedEdge;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 29/11/2013
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class WeightedGraphGraphEdgeModificationBehaviour implements GraphEdgeModificationBehaviour {
    @Override
    public boolean addEdge(Edge e)
    {
        if(e instanceof WeightedEdge)
        {
            WeightedEdge weightedEdge = (WeightedEdge) e;
            WeightedEdge reverseEdge = new WeightedEdge(weightedEdge);
            reverseEdge.setStartingVertex(e.destinationVertex());
            reverseEdge.setDestinationVertex(e.startingVertex());
            return e.startingVertex().addEdge(weightedEdge) && e.destinationVertex().addEdge(reverseEdge);
        }
        else return false;
    }

    @Override
    public boolean removeEdge(Edge e)
    {
        if(e instanceof WeightedEdge)
        {
            WeightedEdge weightedEdge = (WeightedEdge) e;
            WeightedEdge reverseEdge = new WeightedEdge(weightedEdge);
            reverseEdge.setStartingVertex(e.destinationVertex());
            reverseEdge.setDestinationVertex(e.startingVertex());
            return e.startingVertex().removeEdge(weightedEdge) && e.destinationVertex().removeEdge(reverseEdge);
        }
        else return false;
    }
}
