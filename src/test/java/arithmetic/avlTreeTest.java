package arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class avlTreeTest {

    // By doing this Test AVL tree it self
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

        // Make usre that 30 is the root of the tree right now
        assertEquals(30, tree.root.key);
    }

    @Test
    public void avlTestMoreInsertWithDuplication(){
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 30); 
        tree.root = tree.insert(tree.root, 10); 
        tree.root = tree.insert(tree.root, 8); 
        tree.root = tree.insert(tree.root, 3); 
        tree.root = tree.insert(tree.root, 3); 

        tree.root = tree.insert(tree.root, 5); 
        tree.root = tree.insert(tree.root, 5); 

        tree.root = tree.insert(tree.root, 4); 
        tree.root = tree.insert(tree.root, 6); 

        // Make usre that 30 is the root of the tree right now
        assertEquals(5, tree.root.key);
    }
  
    @Test
    public void avlTestgetBalance(){
        AVLTree tree = new AVLTree();
        AVLTree.Node n = tree.new Node(0);
      
        n.left = null;
        assertEquals(0, tree.getBalance(n.left));
    }
}