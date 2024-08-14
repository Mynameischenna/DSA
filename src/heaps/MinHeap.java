package heaps;

import java.util.ArrayList;
import java.util.List;

//value of node is less than all its children
public class MinHeap {
    static List<Integer> list;
    MinHeap(){
        list = new ArrayList<>();
    }
    public MinHeap(int[] arr) {
        // Convert int[] to Integer[] and then to a list
        list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
    }
    void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }
    int remove(){
        int delItem = list.getFirst();
        int last = list.removeLast();
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return delItem;
    }
    public void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min) > list.get(left)){
            min = left;
        }
        if(right < list.size() && list.get(min) > list.get(right)){
            min = right;
        }
        if(min != index){
            swap(min,index);
            downheap(min);
        }

    }
    private int left(int index) {
        return 2 * index + 1;
    }
    private int right(int index) {
        return 2 * index + 2;
    }

    // for adding elements
    private void upheap(int i) {
        if(i == 0) return;
        int p = parent(i);
        if(list.get(i) < list.get(p)){
            swap(i,p);
            upheap(p);
        }
    }

    private void swap(int i, int p) {
        int temp = list.get(i);
        list.set(i,list.get(p));
        list.set(p,temp);
    }

    private int parent(int i) {
        return (i-1)/2;
    }
    public void minHeapCreate(){
        for (int i = list.size()/2; i >= 0 ; i--) {
            downheap(i);
        }
    }

    public static void main(String[] args) {
        MinHeap min = new MinHeap(new int[]{2,4,1,6,8,24});
        min.insert(-10);
//        min.insert(2);
//        min.insert(12);
//        System.out.println(min.list);
        System.out.println(min.remove());
//        System.out.println(min.list);
        // create min heap based on array
        min.minHeapCreate();
        System.out.println(list);
    }
}
