package testing;

import graph.*;
import graph.edgeModificationBehaviours.WeightedDigraphGraphEdgeModificationBehaviour;
import graph.factories.GraphFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 30/11/2013
 * Time: 01:44
 * To change this template use File | Settings | File Templates.
 */
public class WeightedDigraphTest {

    private GraphFactory graphFactory;
    private Graph g;
    private Vertex v1, v2;
    private LinkedList<Vertex> vertices;
    private Edge edge;
    private Edge reverseEdge;

    @Before
    public void initialize()
    {
        graphFactory = new GraphFactory();
        g = graphFactory.createGraph(GraphFactory.WEIGHTED_DIGRAPH);
        v1 = new Vertex("London");
        v2 = new Vertex("NYC");

        vertices = new LinkedList<Vertex>();
        vertices.add(v1);
        vertices.add(v2);

        g.setVertices(vertices);

        edge = new WeightedEdge(v1, v2, 10);
        reverseEdge = new WeightedEdge(v2, v1, 10);
    }

    @Test
    public void testAddEdge()
    {
        assertTrue(g.addEdge(edge));
        assertFalse(g.addEdge(edge));
        assertTrue(g.addEdge(reverseEdge));
    }

    @Test
    public void testRemoveEdge()
    {
        g.addEdge(edge);
        assertTrue(g.removeEdge(edge));
        assertFalse(g.removeEdge(edge));
        assertFalse(g.removeEdge(reverseEdge));
    }

}
