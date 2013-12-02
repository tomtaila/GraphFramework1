package graph;

/**
 * Created with IntelliJ IDEA.
 * User: TomTaila
 * Date: 29/11/2013
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public class WeightedEdge extends Edge{

    private int weight;

    public WeightedEdge(Vertex startV, Vertex destV, int weight) {
        super(startV, destV);
        this.weight = weight;
    }

    public WeightedEdge(WeightedEdge e)
    {
        super(e);
        this.weight = e.weight;
    }

    public int weight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof WeightedEdge)
        {
            WeightedEdge arg = (WeightedEdge) obj;
            return arg.startV.equals(startV) && arg.destV.equals(destV) && arg.weight == weight;
        }
        else return false;
    }

    @Override
    public String toString()
    {
        return startV.getName() + "-"+weight+"-" + destV.getName();
    }
}
