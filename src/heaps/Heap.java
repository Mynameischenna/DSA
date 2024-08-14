package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    List<T> list ;
    public Heap(){
       list = new ArrayList<>();
    }
    public void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    // get parent index
    public int parent(int index){
        return (index-1)/2;
    }
    public int left(int index){
        return 2 * index + 1;
    }
    public int right(int index){
        return 2 * index + 2;
    }
    // insert
    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }
    public void swap(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//    creating heap from unsorted array
    void sortArray(int[] arr){
        for (int i = (arr.length-1)/2; i >=0 ; i--) {
            downHeap(i,arr);
        }
    }
    private void downHeap(int index,int[] arr){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < arr.length && arr[min] < arr[left]){
            min = left;
        }
        if(right < arr.length && arr[min] < arr[right]){
            min = right;
        }
        if(min != index){
            swap(min,index,arr);
            downHeap(min,arr);
        }
    }
    // current added element index,upheap means min heap
    private void upheap(int index) {
        if(index == 0) return;
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index,p);
            upheap(p);
        }
    }
    private T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("list is Empty");
        }
        T delItem = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return delItem;
    }
    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if(min != index){
            swap(min,index);
            downHeap(min);
        }
    }
    public ArrayList<T> heapSort() throws  Exception{
        if(list.isEmpty()) throw new Exception("list is empty you cant not sort");
        ArrayList<T> temp = new ArrayList<T>();
        while (!list.isEmpty()){
            temp.add(remove());
        }
        return temp;
    }

    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(2);
        heap.insert(21);
        heap.insert(12);
        heap.insert(8);
        heap.insert(17);
        int[] arr = {4,1,3,2,16,9,10,14,8,7};
        heap.sortArray(arr);
        System.out.println("max heap is "+ Arrays.toString(arr));

//        System.out.println(heap.heapSort());

    }
}
