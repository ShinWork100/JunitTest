package arithmetic;

import java.util.LinkedList;
import java.util.Stack;


public class ShortestPath {

    int numberOfVectors;
    LoadingTheGraph loadedGraph;
    My2dDynamicArray my2dArr;

    LinkedList <Integer> mapX;
    LinkedList <Integer>mapY;
    LinkedList <Integer>weight;

    LinkedList<Integer> finalVectorsInSortedGrpah;
    LinkedList<Integer> finalWegihtConnected;
    IsConnected connection;
    LinkedList<GraphNode> nodeArr;

    GraphNode tempNode;
    Stack<Integer> previousCheck;

    public ShortestPath(IsConnected connection){

        this.connection = connection;
        nodeArr = new LinkedList<>();
        numberOfVectors = connection.getNumberOfVectors();
        mapX = connection.getLinkedListXcoord();
        mapY = connection.getLinkedListYcoord();
        weight = connection.getLinkedListWeight();
        finalVectorsInSortedGrpah = connection.getLinkedListSortedVectors();
        previousCheck = new Stack<>();
        nodeArrInsert();
        shortProcess(0);

    }

    class ShortNode{
        int previousVector;
        int currentVector;
        ShortNode(){
            previousVector = 0;
        }
        int getPreviousVector(){
            return previousVector;
        }
    }

    // or just use stack to see the what is in the top of

    boolean isItConnected(){
        return connection.isItConnected();
    }

    void numberOfVectexCount(){

        LinkedList<Boolean> check = new LinkedList<>();
        boolean isSame;

        for(int i=0; i < numberOfVectors; i++){
            check.add(false);
        }

        for(int i =0; i<nodeArr.size();i++ ){
            check.set(nodeArr.get(i).getGraphX(),true);
        }

        int count =0;
        for(int i=0; i < check.size(); i++){
            if(check.get(i))
                count++;
        }

        if(count == numberOfVectors)
            isSame = true;
        else
            isSame = false;

        if(isSame != true){
            for(int i =0; i <check.size(); i++){
                if(!check.get(i)){
                    for(int j =0; j< mapX.size(); j++){
                        if(mapY.get(j) == i) {
                            tempNode = new GraphNode(mapY.get(j), mapX.get(j), weight.get(j));
                            nodeArr.add(tempNode);
                        }
                    }
                }
            }
        }
    }

    void nodeArrInsert(){
        for(int i =0; i < mapX.size(); i++){
            tempNode = new GraphNode(mapX.get(i), mapY.get(i),weight.get(i));
            nodeArr.add(tempNode);
        }
        numberOfVectexCount();
    }
    void disPlayNode(){
        for(int i =0; i< nodeArr.size();i++){
            System.out.println("Node: " + nodeArr.get(i));
        }
    }
    void shortProcess(int startingPoint){

//        startingPoint =0;
        int tempStart = startingPoint;
        LinkedList<Integer> vectorWeight = new LinkedList<>();
        int minimum = 0;
        int infinity = 999999999;
        for(int i =0; i < numberOfVectors; i++){
            vectorWeight.add(0);
        }

        // for latter temp start + number of Vectors
        for(int i =0; i< numberOfVectors; i++){
           for(int j = 0; j< nodeArr.size(); j++) {
//               if(startingPoint == i){
//                   continue;
//               }
               if(nodeArr.get(j).getGraphX() == tempStart){
                   int tempY  = nodeArr.get(j).getGraphY();
//                   if(startingPoint.)
                   if(vectorWeight.get(i) == infinity){
                       // initializing the linked list with beginning weight
                       vectorWeight.set(i, nodeArr.get(j).getGraphY());
                   }
                   if(vectorWeight.get(i) < vectorWeight.get(tempY)){

                   }
                   else{
                       vectorWeight.set(i, vectorWeight.get(i) + nodeArr.get(j).getGraphY());
                   }
               }
           }

           tempStart++;

           if(startingPoint >= numberOfVectors){
               startingPoint = 0;
           }
        }

    }
}