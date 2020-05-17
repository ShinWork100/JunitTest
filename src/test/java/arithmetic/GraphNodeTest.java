package arithmetic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.text.AbstractDocument.LeafElement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class GraphNodeTest {
    @Test
    public void graphNodeTest(){
        GraphNode temp = new GraphNode(1, 2, 3);
        String result = "( " + temp.x + " , "+temp.y +" )" +"   weight: " +temp.weight;
        assertEquals(result, temp.toString());
    }

    @Test
    public void getWeight(){
        GraphNode temp = new GraphNode(1, 2, 3);
        assertEquals(3, temp.getGraphWeight());
    }
    
}