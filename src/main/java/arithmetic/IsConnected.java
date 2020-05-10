package arithmetic;

import java.util.*;


public class IsConnected {
    int NumberOfVectors;
    LoadingTheGraph loadedGraph;
    My2dDynamicArray my2dArr;
    LinkedList <Integer> mapX;
    LinkedList <Integer>mapY;
    LinkedList <Integer>weight;
    //
    LinkedList<Integer> finalVectorsInSortedGrpah;
    LinkedList<Integer> finalWegihtConnected;

    int listForVector;
    boolean connected;

    public IsConnected(){

    }

    public IsConnected(LoadingTheGraph loadedGraph){
        this.loadedGraph = loadedGraph;
        this.NumberOfVectors = loadedGraph.getNumberOfVectors();
        this.loadedGraph = loadedGraph;
        my2dArr = loadedGraph.getMy2d();
        mapX = new LinkedList<>();
        mapY = new LinkedList<>();
        weight = new LinkedList<>();
        finalVectorsInSortedGrpah = new LinkedList<>();
        finalWegihtConnected = new LinkedList<>();

        //function starts
        xyCheck();
        connected = isConnectedProcess();
    }
    boolean isItConnected(){
        return connected;
    }
    boolean xyCheck(){

        int tempX;
        ArrayList<Integer> tempArr;

        for(int x =0; x<loadedGraph.getNumberOfVectors(); x++){
            for(int y =0; y<loadedGraph.getNumberOfVectors(); y++){
                //self loop check
                if(x == y)
                    continue;
                //if you use map you can not have same key
                if (my2dArr.get(x,y)!=0){
                    // array of array so
                    //first array get x value second array y value
                    mapX.add(x);
                    mapY.add(y);
                    weight.add(my2dArr.get(x,y));
                }
            }
        }
        return false;
    }

    boolean isConnectedProcess(){
        LinkedList tempX = mapX;
        LinkedList tempY = mapY;
        LinkedList tempWeight = weight;
        int count = 0;
//
//        for (int i =0; i < mapX.size(); i++){
//                        System.out.println("(" +mapX.get(i) +" , " + mapY.get(i)+")");
//        }
//        //

        for (int i = 0; i< mapX.size(); i++){
            for(int j = i+1; j < mapX.size(); j++){
                if(mapX.get(i) == mapY.get(j) && mapY.get(i) == mapX.get(j)) {
                    tempX.remove(j);
                    tempY.remove(j);
                    tempWeight.remove(j);
                }
            }
        }
//        System.out.println("tempX size: "+  tempY.size());
//        for (int i =0; i < tempX.size(); i++) {
//            System.out.println("(" +tempX.get(i) +" , " + tempY.get(i)+")" +"  Weight: " + tempWeight.get(i) );
//        }
        // putting everything in final sort
        for (int i =0; i < tempX.size(); i ++ ){
            for (int j = 0; j < finalVectorsInSortedGrpah.size()+1; j++){

                int typeCheckX = (int)tempX.get(i);
                int typeCheckY = (int)tempY.get(i);

                if(!finalVectorsInSortedGrpah.contains(typeCheckX)){
                    int xGen = (int)tempX.get(i);
                    int weightGen = (int) tempWeight.get(i);
                    finalVectorsInSortedGrpah.add(xGen);
                    finalWegihtConnected.add(weightGen);
                }

                if(!finalVectorsInSortedGrpah.contains(typeCheckY)){
                    int yGen = (int)tempY.get(i);
                    int weightGen = (int) tempWeight.get(i);
                    finalVectorsInSortedGrpah.add(yGen);
                    finalWegihtConnected.add(weightGen);
                }
            }
        }
        mapX = tempX;
        mapY = tempY;
        weight = tempWeight;

        if(tempX.size() >= loadedGraph.getNumberOfVectors()-1
                && finalVectorsInSortedGrpah.size() == loadedGraph.getNumberOfVectors())
            return true;
        return false;
    }

    LinkedList<Integer> getLinkedListSortedVectors(){
        return finalVectorsInSortedGrpah;
    }

    LinkedList<Integer> getLinkedListWeight(){
        return weight;
    }
    LinkedList<Integer> getLinkedListXcoord(){
        return mapX;
    }
    LinkedList<Integer> getLinkedListYcoord(){
        return mapY;
    }
    // previous void check will prevent the same value
    //array list size x and y has to be same
    // array list size x = vectorNumber -1
    // x ,y  can not be symetric
    // so if getX getY = getY getX ignore
    //is arraylist size is greater than vector number -1
    boolean finalCheck(){
        return false;
    }
    int getNumberOfVectors(){
        return loadedGraph.getNumberOfVectors();
    }
}
