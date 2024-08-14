package Generics;

import java.util.Arrays;

public class CustomeArrayList {

    private int arr[];
    private static int DEFAULT_SIZE = 10; // default capacity of array list
    private int size = 0; // size of the array list

    public CustomeArrayList() {
         arr = new int[DEFAULT_SIZE];
    }

    public void add(int element){
        if(isFull()){
            modifySize();
        }
        arr[size++] = element;
    }

    private void modifySize() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public int remove(){
        return arr[--size] ;
    }
    public int get(int index){
        return arr[index];
    }
    public void set(int index, int element){
        arr[index] = element;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size >= arr.length;
    }

    @Override
    public String toString() {
        return "CustomeArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
