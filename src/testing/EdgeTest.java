package testing;

import graph.Edge;
import graph.Vertex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 26/11/2013
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class EdgeTest {

    private Edge edge;
    private Vertex v1;
    private Vertex v2;

    @Before
    public void initialize()
    {
        v1 = new Vertex("London");
        v2 = new Vertex("NYC");
        edge = new Edge(v1, v2);
    }

    @Test
    public void testEquals()
    {
        assertEquals(new Edge(v1, v2), edge);
    }


}
