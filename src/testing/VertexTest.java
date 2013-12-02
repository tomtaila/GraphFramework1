package testing;

import graph.Edge;
import graph.Vertex;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 26/11/2013
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
public class VertexTest {


    List<Edge> edgeList;
    Edge e1;
    Edge e2;
    Vertex v1;
    Vertex v2;
    Vertex v3;
    Vertex v4;

    @Before
    public void initialize()
    {
        v1 = new Vertex("London");
        v2 = new Vertex("NYC");
        v3 = new Vertex("Paris");
        v4 = new Vertex("Tokyo");

        e1 = new Edge(v1, v2);
        edgeList = new LinkedList<Edge>();
        edgeList.add(e1);
    }

    @Test
    public void testAddEdge()
    {
        assertTrue(v1.addEdge(e1));
        assertFalse(v1.addEdge(e1));
        assertEquals(edgeList, v1.incidentEdges());
    }

    @Test
    public void testRemoveEdge()
    {
        v1.addEdge(e1);
        assertTrue(v1.removeEdge(e1));
        assertFalse(v1.removeEdge(e1));
        assertEquals(new LinkedList<Edge>(), v1.incidentEdges());
    }

    @Test
    public void testEquals()
    {
        v1.addEdge(e1);
        Vertex london = new Vertex("London");
        london.addEdge(e1);
        assertEquals(london, v1);
    }
}
