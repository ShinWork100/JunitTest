package arithmetic;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class LoadingTheGraph {

    String fileName;
    ArrayList<Vector> vec = new ArrayList<>();
    int numberOfVectors;
    My2dDynamicArray my2dDynamicArray;


    LoadingTheGraph(String fileName) throws Exception{
        this.fileName = fileName;
        numberOfVectors = -1;
        my2dDynamicArray = new My2dDynamicArray();
        letsReadKey(fileName);
//        displayMatrix();
    }

    public void letsReadKey(String input) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader(input))){
            String str;
            String[] splitStr;
            int tempLength;
            int tempX =0;
            int tempY;
            int tempIndex = 1;
            int tempWeight;

            while((str = br.readLine() )!= null) {

                splitStr = str.split("\\s+");
                numberOfVectors++;
                tempLength = Integer.parseInt(splitStr[0]);
                if(tempX ==0){
                    tempX++;
                    continue;
                }
                for(int i=0; i < tempLength; i++){
                    // node need to make an exception for 0 node
                    tempY = Integer.parseInt(splitStr[tempIndex]);
                    tempWeight =Integer.parseInt(splitStr[tempIndex+1]);
//                    System.out.print(tempWeight + " ");
                    my2dDynamicArray.add(tempX-1,tempY,tempWeight);
                    tempIndex = tempIndex +2;
                }
//                System.out.println();
                tempX++;
                tempIndex = 1;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    // void displayMatrix(){
    //     for(int x=0; x< numberOfVectors; x++){
    //         for(int y=0; y< numberOfVectors; y++){
    //             System.out.print(my2dDynamicArray.get(x,y) + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    int getNumberOfVectors(){
        return numberOfVectors;
    }

    My2dDynamicArray getMy2d(){
        return my2dDynamicArray;
    }

    void makeMatrix(){

    }

    boolean isConnected(int num1, int num2, int arrSize){
        if(num1 == arrSize) return false;
        return true;
    }

}
