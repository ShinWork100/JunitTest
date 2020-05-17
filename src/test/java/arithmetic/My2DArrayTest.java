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
    // @Test
    // public void isMaxTest(){
    //     My2dDynamicArray temp = new My2dDynamicArray();
    //     for(int i =0; i < 110; i++){
    //         for(int y = 0; y< 110; y ++){
    //             if(i ==100 && y == 100){
    //                 assertTrue(temp.isMax(i, y));
    //             }
    //             temp.add(i,y,i+y);
    //         }
    //     }
    // }
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

        // assertEquals(temp , temp.getMy2d());
    }
    
}