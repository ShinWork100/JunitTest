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

public class BSTTest {
    
    @Test
    public void bstInsertRight(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        assertEquals( 20, bst.root.right.key );
    }
       
    @Test
    public void bstRootCheck(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        assertEquals( 10, bst.root.key );
    }   
    @Test
    public void bstInsertLeftCheck(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(4);
        assertEquals( 5, bst.root.left.key );
    }
       
    @Test
    public void bstDeleteLeft(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(4);

        bst.deleteKey(5);
        assertEquals( 4, bst.root.left.key );
    }
    @Test
    public void bstDeleteRight(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);

        bst.deleteKey(20);
        assertEquals( 30, bst.root.right.key );
    }

    @Test
    public void bstDeleteRoot(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);

        bst.deleteKey(10);
        
        assertEquals( 30, bst.root.right.key );
    }

    @Test
    public void bstInorder(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
         
        bst.inorder();
        bst.inorderRec(bst.root);
    }

    @Test
    public void minValueTest(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(5);
        bst.insert(4); 
        
        assertEquals(4, bst.minValue(bst.root));
    }

    
}