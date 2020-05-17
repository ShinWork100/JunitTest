// package arithmetic;

// import java.util.ArrayList;
// import java.util.Scanner;

// public class EveryTest {
//     public static void main(String[] args)throws Exception{
//         Scanner in = new Scanner(System.in);
//         System.getProperty("user.dir");

//         // String path = "jproject/gitProject/";
//         String path = "/Users/dongminshin/projects/jproject/gitProject/";
//         String fileName = "test1.txt";
//         LoadingTheGraph load = new LoadingTheGraph(path + fileName);
//         IsConnected connectionCheck = new IsConnected(load);
//         ShortestPath shortPath = new ShortestPath(connectionCheck);
//         MnimumSpanningTree minimum = new MnimumSpanningTree(connectionCheck);
//         System.out.println("This is Graph and Shortest Path ");
//         process(connectionCheck, minimum, shortPath);
//     }
//         public static boolean process(IsConnected connect, MnimumSpanningTree minimumTree,
//                         ShortestPath shortPath, int temp){

//         Scanner in = new Scanner(System.in);
//         boolean quit = false;
//         String error = "Erorr: Graph is NOT connected";
        

//             switch (temp){
//                 case 1:
//                     if(connect.isItConnected())
//                         return true;
//                     else
//                         return false;
//                 case 2:
//                     if(connect.isItConnected())
//                         minimumTree.disPlayMy2d();
//                     else
//                         System.out.println(error);
//                     System.out.println();
//                     break;//if graph is not connected return Error

//                 case 3:
//                     if(connect.isItConnected()) {
//                         System.out.println("From which node would you like to find the shortest paths (0 - 5): ");
//                         int shortTemp = in.nextInt();
//                         if(shortTemp < shortPath.numberOfVectors){
//                             shortPath.disPlayNode();
//                             break;
//                         }
//                         System.out.println("Error: Input number is out of the range");
//                     }
//                     break;//if graph is not connected return Error

//                 case 4: quit = true; break;
//             }
        
//     }
    
// }

// //     public static void main(String[] args)throws Exception{
// //         Scanner in = new Scanner(System.in);
// //         System.getProperty("user.dir");

// //         // String path = "jproject/gitProject/";
// //         String path = "/Users/dongminshin/projects/jproject/gitProject/";
// //         String fileName = "test1.txt";
// //         LoadingTheGraph load = new LoadingTheGraph(path + fileName);
// //         IsConnected connectionCheck = new IsConnected(load);
// //         ShortestPath shortPath = new ShortestPath(connectionCheck);
// //         MnimumSpanningTree minimum = new MnimumSpanningTree(connectionCheck);
// //         System.out.println("This is Graph and Shortest Path ");
// //         process(connectionCheck, minimum, shortPath);
// //         System.out.println();
// //         System.out.println("-----------------------------------------------------------------");

// //         AVLTree tree = new AVLTree(); 
        
// //         /* Constructing tree given in the above figure */
// //         tree.root = tree.insert(tree.root, 10); 
// //         tree.root = tree.insert(tree.root, 20); 
// //         tree.root = tree.insert(tree.root, 30); 
// //         tree.root = tree.insert(tree.root, 40); 
// //         tree.root = tree.insert(tree.root, 50); 
// //         tree.root = tree.insert(tree.root, 25); 

// //         /* The constructed AVL Tree would be 
// //             30 
// //             /  \ 
// //         20   40 
// //         /  \     \ 
// //         10  25    50 
// //         */
// //         System.out.println("Preorder traversal" + 
// //                     " of constructed tree is : "); 
// //         tree.preOrder(tree.root); 
// //         System.out.println();

// //         System.out.println("-----------------------------------------------------------------");
// //         // ------------------------------------------------------------------
// //         BinarySearchTree tree2 = new BinarySearchTree(); 
  
// //         /* Let us create following BST 
// //               50 
// //            /     \ 
// //           30      70 
// //          /  \    /  \ 
// //         20   40  60   80 */
// //         tree2.insert(50); 
// //         tree2.insert(30); 
// //         tree2.insert(20); 
// //         tree2.insert(40); 
// //         tree2.insert(70); 
// //         tree2.insert(60); 
// //         tree2.insert(80); 
  
// //         System.out.println("Inorder traversal of the given tree"); 
// //         tree2.inorder(); 
  
// //         System.out.println("\nDelete 20"); 
// //         tree2.deleteKey(20); 
// //         System.out.println("Inorder traversal of the modified tree"); 
// //         tree2.inorder(); 
  
// //         System.out.println("\nDelete 30"); 
// //         tree2.deleteKey(30); 
// //         System.out.println("Inorder traversal of the modified tree"); 
// //         tree2.inorder(); 
  
// //         System.out.println("\nDelete 50"); 
// //         tree2.deleteKey(50); 
// //         System.out.println("Inorder traversal of the modified tree"); 
// //         tree2.inorder(); 
// //         System.out.println();

// //         System.out.println("-----------------------------------------------------------------");

// //         System.out.println("The Min Heap is "); 
// //         MinHeap minHeap = new MinHeap(15); 
// //         minHeap.insert(5); 
// //         minHeap.insert(3); 
// //         minHeap.insert(17); 
// //         minHeap.insert(10); 
// //         minHeap.insert(84); 
// //         minHeap.insert(19); 
// //         minHeap.insert(6); 
// //         minHeap.insert(22); 
// //         minHeap.insert(9); 
// //         minHeap.minHeap(); 
  
// //         minHeap.print(); 
// //         System.out.println("The Min val is " + minHeap.remove()); 
// //         in.close();
// //     }

// //     void arrayListTest(){
// //         ArrayList<ArrayList<Integer>> arrayOfARRAY =
// //                 new ArrayList<ArrayList<Integer>>();
// //         ArrayList<Integer> test;
// //         for (int i =0; i < 10; i++){
// //             test = new ArrayList<>();
// //             test.add(i);
// //             test.add(i+1);
// //             test.add(i+3);
// //             arrayOfARRAY.add(test);
// //         }
// //         for(int i =0; i < arrayOfARRAY.size(); i++){
// //             for(int y = 0; y < arrayOfARRAY.get(i).size(); y++){
// //                 System.out.println(arrayOfARRAY.get(i));
// //             }
// //         }
// //     }

// //     static int userInput(){
// //         Scanner in = new Scanner(System.in);
// //         System.out.println("The choice of Menu");
// //         System.out.println("1. Is Connected?");
// //         System.out.println("2. Minimum Spanning Tree");
// //         System.out.println("3. Shortest Path");
// //         System.out.println("4. Quit");
// //         System.out.println("Make your choice (1 - 4): ");
// //         int temp = in.nextInt();
// //         System.out.println();
// //         return  temp;
// //     }

// //     static void process(IsConnected connect, MnimumSpanningTree minimumTree,
// //                         ShortestPath shortPath){

// //         Scanner in = new Scanner(System.in);
// //         boolean quit = false;
// //         int temp;
// //         String error = "Erorr: Graph is NOT connected";
// //         while(!quit){
// //             temp = userInput();

// //             switch (temp){
// //                 case 1:
// //                     if(connect.isItConnected())
// //                         System.out.println("Graph is Connected");
// //                     else
// //                         System.out.println("Graph is Not Connected");
// //                     System.out.println();
// //                     break;

// //                 case 2:
// //                     if(connect.isItConnected())
// //                         minimumTree.disPlayMy2d();
// //                     else
// //                         System.out.println(error);
// //                     System.out.println();
// //                     break;//if graph is not connected return Error

// //                 case 3:
// //                     if(connect.isItConnected()) {
// //                         System.out.println("From which node would you like to find the shortest paths (0 - 5): ");
// //                         int shortTemp = in.nextInt();
// //                         if(shortTemp < shortPath.numberOfVectors){
// //                             shortPath.disPlayNode();
// //                             break;
// //                         }
// //                         System.out.println("Error: Input number is out of the range");
// //                     }
// //                     break;//if graph is not connected return Error

// //                 case 4: quit = true; break;
// //             }
// //         }
// //     }
// // }
