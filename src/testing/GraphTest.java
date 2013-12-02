package testing;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import graph.edgeModificationBehaviours.NonWeightedGraphGraphEdgeModificationBehaviour;
import graph.factories.GraphFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 28/11/2013
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class GraphTest {

    private GraphFactory graphFactory;
    private Graph g;
    private Vertex v1, v2, v3;
    private LinkedList<Vertex> vertices;
    private Edge edge;
    private Edge reverseEdge;

    @Before
    public void initialize()
    {
        graphFactory = new GraphFactory();
        g = graphFactory.createGraph(GraphFactory.UNWEIGHTED_GRAPH);
        v1 = new Vertex("London");
        v2 = new Vertex("NYC");
        v3 = new Vertex("Tokyo");

        vertices = new LinkedList<Vertex>();
        vertices.add(v1);
        vertices.add(v2);

        g.setVertices(vertices);

        edge = new Edge(v1, v2);
        reverseEdge = new Edge(v2, v1);
    }

    @Test
    public void testAddVertexThatDoesntAlreadyExist()
    {
        assertTrue(g.addVertex(v3));
    }

    @Test
    public void testAddVertexThatAlreadyExists()
    {
        assertFalse(g.addVertex(v1));
    }

    @Test
    public void testRemoveVertexThatExists()
    {
        assertTrue(g.removeVertex(v1));
    }

    @Test
    public void testRemoveVertexThatDoesntExist()
    {
        assertFalse(g.removeVertex(v3));
    }

    @Test
    public void testAddEdge()
    {
        assertTrue(g.addEdge(edge));
        assertFalse(g.addEdge(edge));
        assertFalse(g.addEdge(reverseEdge));
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
