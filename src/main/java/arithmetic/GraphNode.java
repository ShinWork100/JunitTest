package arithmetic;


public class GraphNode {

    int x;
    int y;
    int weight;
    GraphNode next;

    public GraphNode(int x, int y, int weight){
        this.x = x;
        this.y = y;
        this.weight = weight;
    }

    public String toString(){
        return "( " + x + " , "+y +" )" +"   weight: " +weight;
    }

    public int getGraphX(){ return x; }

    public int getGraphY(){ return y; }

    public int getGraphWeight(){ return weight; }

}

