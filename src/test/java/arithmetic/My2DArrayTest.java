package arithmetic;

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


// This class is Testing 2D dynamic Array [][] and imeplemented
public class My2DArrayTest {
   
    @Test
    public void my2darrayAddTest(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.add(0, 0,1);
        temp.add(0,1,2);
        temp.add(0,2,3);

        int array[][] = new int[100][100];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        
        assertEquals(temp.get(0, 0), 1);
    }

    @Test
    public void createNewTestSame(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.createNew(101, 101);
    }

    @Test
    public void createNewTestX(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.createNew(120, 80);
    }

    @Test
    public void createNewTestY(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.createNew(80, 120);
    }

    @Test
    public void isMaxTX(){
        My2dDynamicArray temp = new My2dDynamicArray();
        assertTrue(temp.isMax(120,40));
    }

    @Test
    public void isMaxTy(){
        My2dDynamicArray temp = new My2dDynamicArray();
        assertTrue(temp.isMax(40,120));
    } 
    
    @Test
    public void isMaxFx(){
        My2dDynamicArray temp = new My2dDynamicArray();
        assertFalse(temp.isMax(30,10));
    } 
    
    @Test
    public void isMaxFy(){
        My2dDynamicArray temp = new My2dDynamicArray();
        assertFalse(temp.isMax(20,30));
    }

    @Test
    public void getTest(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.add(0, 0,1);
        temp.add(0,1,2);
        temp.add(0,2,3);

        assertEquals(1 , temp.get(0, 0));
    }
    
    @Test
    public void getMy2dTest(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.add(0, 0,1);
        temp.add(0,1,2);
        temp.add(0,2,3);

        int[][] arr = temp.getMy2d();
        int[][] arrTemp = new int [100][100];

        arrTemp[0][0] = 1;
        arrTemp[0][1] = 2;
        arrTemp[0][2] = 3;

        assertEquals(arrTemp[0][0], arr[0][0]);
    }
    
    @Test
    public void addMore(){
        My2dDynamicArray temp = new My2dDynamicArray();
        temp.add(110,110, 10);
        temp.initialize();
        assertTrue(temp.currntSize > 100);
    } 
    
}