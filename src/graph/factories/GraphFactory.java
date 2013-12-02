package graph.factories;

import graph.Graph;
import graph.edgeModificationBehaviours.*;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 30/11/2013
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */
public class GraphFactory {

    public static final int UNWEIGHTED_GRAPH = 0;
    public static final int UNWEIGHTED_DIGRAPH = 1;
    public static final int WEIGHTED_GRAPH = 2;
    public static final int WEIGHTED_DIGRAPH = 3;


    public Graph createGraph(int graphType)
    {
        switch (graphType) {
            case UNWEIGHTED_GRAPH:  return new Graph(new NonWeightedGraphGraphEdgeModificationBehaviour());
            case UNWEIGHTED_DIGRAPH:  return new Graph(new NonWeightedDigraphGraphEdgeModificationBehaviour());
            case WEIGHTED_GRAPH:  return new Graph(new WeightedGraphGraphEdgeModificationBehaviour());
            case WEIGHTED_DIGRAPH:  return new Graph(new WeightedDigraphGraphEdgeModificationBehaviour());
            default: return new Graph(new NonWeightedGraphGraphEdgeModificationBehaviour());
        }
    }


}
