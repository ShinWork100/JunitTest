package arithmetic;


import java.util.LinkedList;

// from what I have
// find vertext to vertex the lowest weight
// example find the lowest weight in the matrix or the array.
//when its found
public class MnimumSpanningTree {

    IsConnected connection;
    int numbeOfVectrs;
    LinkedList<Integer> weight;
    LinkedList<Integer> xList;
    LinkedList<Integer> yList;
    LinkedList<Integer> vectorContainer;
    LinkedList<Integer> countNeighbor;

    My2dDynamicArray my2dArr;



    public  MnimumSpanningTree(IsConnected connection){
        this.connection = connection;
        numbeOfVectrs = connection.getNumberOfVectors();
        vectorContainer = new LinkedList<>();
        countNeighbor = new LinkedList<>();
        weight = connection.getLinkedListWeight();
        xList = connection.getLinkedListXcoord();
        yList = connection.getLinkedListYcoord();
        my2dArr = new My2dDynamicArray();
//        display();
        minimuProcess();
        putMinimumTo2D();
//        disPlayMy2d();
    }

    void minimuProcess(){
        LinkedList<Integer> tempX = new LinkedList<>();
        LinkedList<Integer> tempY = new LinkedList<>();
        LinkedList<Integer> tempWeight = new LinkedList<>();

        int rememberJIndex =0;
        int minimum = 999999999;
        int count = xList.size();

        for(int i =0; i<numbeOfVectrs-1; i++){
//            System.out.println("weight " + weight.size() + " x size :"  + xList.size() );

            for(int y= 0; y < weight.size(); y++){
                if(weight.get(y) <= minimum){
                    minimum = weight.get(y);
                    rememberJIndex = y;
                }
            }
            tempX.add(xList.get(rememberJIndex));
            tempY.add(yList.get(rememberJIndex));
            tempWeight.add(minimum);

            xList.remove(rememberJIndex);
            yList.remove(rememberJIndex);
            weight.remove(rememberJIndex);
            minimum = 99999999;
            if (tempX.size() == numbeOfVectrs-1)
                break;
        }
        xList = tempX;
        yList = tempY;
        weight = tempWeight;
//        for(int i =0; i< tempX.size(); i++){
//            System.out.println("( " +tempX.get(i) +" , "+ tempY.get(i) +" )    Weight:  " +tempWeight.get(i) );
//        }
    }
    void countNeigbor(){
        for (int i =0; i <xList.size(); i++){
//            for(int j =0; j<)
        }
    }
    void putMinimumTo2D(){
        for(int i =0; i < xList.size(); i++){
            my2dArr.add(xList.get(i), yList.get(i), weight.get(i));
            my2dArr.add(yList.get(i), xList.get(i), weight.get(i));
        }
    }
    void disPlayMy2d(){
        int count =0;
        String tempStr ="";
        System.out.println(numbeOfVectrs);
        for(int i =0; i< numbeOfVectrs; i++){
            for(int j =0; j< numbeOfVectrs; j++){
                if(my2dArr.get(i,j) != 0){
                    count++;
                    tempStr = tempStr + j + " " + my2dArr.get(i,j)+" ";
//                    System.out.print(j + " "+my2dArr.get(i,j) +" ");
                }
            }
            System.out.print(count +" "+tempStr);
            System.out.println();
            tempStr = "";
            count = 0;
        }
    }
    boolean isItConnected(){
        return connection.isItConnected();
    }

    void display(){
        for(int i =0; i < numbeOfVectrs; i++){
            if(i==0){
                System.out.println(numbeOfVectrs);
                continue;
            }

        }
    }
    //covert to the symetric
    void makingMatrix(){

    }
}
