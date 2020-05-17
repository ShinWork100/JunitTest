package arithmetic;
import java.util.ArrayList;
import java.util.Scanner;
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

public class MInimumSpanningTreeTest {
    @Test 
    public void minSTest() throws Exception{
        
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test1.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);
        ShortestPath shortPath = new ShortestPath(connectionCheck);
        MnimumSpanningTree minimum = new MnimumSpanningTree(connectionCheck);
        minimum.disPlayMy2d();
        minimum.display();
        minimum.makingMatrix();
        minimum.countNeigbor();
        assertTrue(minimum.isItConnected());
        // EveryTest top = new EveryTest();
        // top.process(connectionCheck, minimum, shortPath);
    }
}