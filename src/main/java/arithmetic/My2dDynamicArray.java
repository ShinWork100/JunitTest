package arithmetic;

import java.util.Arrays;

public class My2dDynamicArray {
    int array[][];
    int currntSize;

    My2dDynamicArray(){
        currntSize = 100;
        create2d(currntSize);
    }

    void add(int x, int y, int input){
        if(isMax(x,y))
            createNew(x,y);
        array[x][y] = input;
    }

    void create2d(int currntSize){
            array = new int[currntSize][currntSize];
    }
    void initialize(){

    }
    void createNew(int x ,int y){
        //getting bigger by 2 so 2^n every time
        int temp;
        if(x>= y)
            temp = x;
        else
            temp = y;

        int[][] tempArr = new int[temp*2][temp*2];
        for(int i = 0; i< currntSize; i++){
            for(int z =0; z<currntSize; z++){
                tempArr[i][z] = array[i][z];
            }
        }
        currntSize = temp*2;
        array = tempArr;
    }

    boolean isMax(int x, int y){
        return x >= currntSize+1 || y >= currntSize+1;
    }

    int get(int x, int y){
        return array[x][y];
    }

    int[][] getMy2d(){
        return array;
    }
}
