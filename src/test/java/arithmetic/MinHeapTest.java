package arithmetic;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

public class MinHeapTest {
    @Test
    public void insertandRemove(){
       MinHeap temp = new MinHeap(5);
       temp.insert(1);
       temp.insert(3);
       temp.insert(6);
       temp.insert(8);
       temp.minHeap();
       
       assertEquals(1, temp.remove());
    }
    @Test
    public void leftChildTest(){
        MinHeap temp = new MinHeap(5);
        temp.insert(1);
        temp.insert(7);
        temp.minHeap();

        assertEquals(1, temp.remove());
    }
    @Test
    public void swapLeftTest(){
        MinHeap temp = new MinHeap(6);
        temp.insert(3);
        temp.insert(5);
        temp.insert(7);
        temp.insert(6); temp.insert(11);
        temp.insert(8); temp.insert(14);
        // temp.insert(4); temp.insert(17);
        // temp.insert(2); temp.insert(20);
        // temp.insert(10); temp.insert(21);
        // temp.insert(12);

        temp.minHeap();

        assertEquals(3, temp.remove());
    }
    @Test
    public void swapRightTest(){
        MinHeap temp = new MinHeap(20);
        temp.insert(19);
        temp.insert(15);
        temp.insert(17);
        temp.insert(16); temp.insert(9);
        temp.insert(18); temp.insert(4);
        temp.insert(14); temp.insert(7);
        temp.insert(12); temp.insert(2);
        temp.insert(10); temp.insert(5);
        temp.insert(1);

        temp.minHeap();

        assertEquals(1, temp.remove());
    }
    @Test
    public void indexTest(){
        MinHeap temp = new MinHeap(5);

        temp.insert(1); 
        temp.insert(4);
        temp.insert(7);
        temp.insert(10);
        temp.minHeap();

        assertEquals(1, temp.remove());
    }



    // public void leftRightTest(){

    //     MinHeap temp = new MinHeap(5);
    //     temp.insert(1);
    //     temp.insert(3); 
    //     temp.minHeap();

    //     assertEquals(1, temp.remove());

    // }

    // public void swapTest(){
    //     temp.insert(1);
    //     temp.insert(3); 
    //     temp.minHeap();

    // }
}