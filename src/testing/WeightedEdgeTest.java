package testing;

import graph.Vertex;
import graph.WeightedEdge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 29/11/2013
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
public class WeightedEdgeTest{

    private WeightedEdge e;
    private Vertex v1;
    private Vertex v2;

    @Before
    public void initialize()
    {
        v1 = new Vertex("London");
        v2 = new Vertex("NYC");
        e = new WeightedEdge(v1, v2, 10);
    }

    @Test
    public void testEquals()
    {
        assertEquals(new WeightedEdge(v1, v2, 10), e);
        assertFalse(new WeightedEdge(v1, v2, 11).equals(e));
    }

}
