package arithmetic;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class loadingTheGraphTest {
    @Test
    public void loadTheGraph()throws Exception{
        String path  = "/Users/dongminshin/projects/jproject/arithmetic/src/main/java/arithmetic/";
        String fileName = "test1.txt";
        LoadingTheGraph temp = new LoadingTheGraph(path + fileName);
        assertEquals(0, temp.my2dDynamicArray.get(0, 0));
    }
    @Test
    public void isconnectedTestF()throws Exception{
        String fileName = "test1.txt";
        String path  = "/Users/dongminshin/projects/jproject/arithmetic/src/main/java/arithmetic/";

        LoadingTheGraph temp = new LoadingTheGraph(path + fileName);
        assertTrue(temp.isConnected(10, 20, temp.my2dDynamicArray.currntSize));
    }
    @Test
    public void isconnectedTestT()throws Exception{
        String fileName = "test1.txt";
        String path  = "/Users/dongminshin/projects/jproject/arithmetic/src/main/java/arithmetic/";

        LoadingTheGraph temp = new LoadingTheGraph(path + fileName);
        assertFalse(temp.isConnected(100, 20, temp.my2dDynamicArray.currntSize));
    }
}