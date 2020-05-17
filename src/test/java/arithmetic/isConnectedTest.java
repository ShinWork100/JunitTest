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

public class isConnectedTest {

    @Test
    public void isConnecgTrue() throws Exception{
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test1.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        assertTrue(connectionCheck.isItConnected());
    }

    @Test
    public void IsConnectedFalsed()throws Exception{
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test2.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);

        assertFalse(connectionCheck.isItConnected());
    }

    @Test
    public void IsConnectedFinaleCheckandisconnected()throws Exception{
        Scanner in = new Scanner(System.in);
        // String path = "jproject/gitProject/";
        String path = "/Users/dongminshin/projects/jproject/gitProject/";
        String fileName = "test2.txt";
        LoadingTheGraph load = new LoadingTheGraph(path + fileName);
        IsConnected connectionCheck = new IsConnected(load);
        IsConnected trash = new IsConnected();
        
        assertFalse(connectionCheck.finalCheck());
    }
}