package arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class avlTreeTest {
    @Test
    public void avlTest(){
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10); 
        tree.root = tree.insert(tree.root, 20); 
        tree.root = tree.insert(tree.root, 30); 
        tree.root = tree.insert(tree.root, 40); 
        tree.root = tree.insert(tree.root, 50); 
        tree.root = tree.insert(tree.root, 25);   

        tree.preOrder(tree.root);

        assertEquals(30, tree.root.key);
    }
  
}