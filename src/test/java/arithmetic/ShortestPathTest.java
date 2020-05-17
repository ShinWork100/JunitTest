package arithmetic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

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

public class ShortestPathTest {
    @Test
    public void shortPathTestInnerClass() throws Exception {
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test1.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        ShortestPath temp = new ShortestPath(connectionCheck);

        // calling a inner class
        ShortestPath.ShortNode inner = temp.new ShortNode();
        assertEquals( 0 , inner.getPreviousVector());
    }

    @Test
    public void shortPathIsitConnectedT() throws Exception {
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test1.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        ShortestPath temp = new ShortestPath(connectionCheck);

        // calling a inner class
        assertTrue(temp.isItConnected());
    }

    @Test
    public void shortPathIsitConnectedf() throws Exception {
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test2.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        ShortestPath temp = new ShortestPath(connectionCheck);

        temp.disPlayNode();

        // testing the result of is the graph connected
        assertFalse(temp.isItConnected());
    }


    @Test
    public void shortPathProcess() throws Exception {
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test2.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        ShortestPath temp = new ShortestPath(connectionCheck);

        temp.shortProcess(1);
        temp.shortProcess(2);
        temp.shortProcess(3);
        temp.shortProcess(4);
        temp.shortProcess(5);


        assertFalse(temp.isItConnected());
    }

}