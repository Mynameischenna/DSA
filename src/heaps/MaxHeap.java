package heaps;

import java.util.ArrayList;
import java.util.List;
// node value should be greater than or equal to all its children
public class MaxHeap {
    static List<Integer> list;
    public MaxHeap(){
        list = new ArrayList<>();
    }

    // insert an element into max heap
    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }
    // delete an element
    public int delete(){
        int delItem = list.get(0);
        int last = list.removeLast();
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return delItem;
    }

    private void downheap(int i) {
        int max = i;
        int left = left(i);
        int right = right(i);

        if(left < list.size() && list.get(max) < list.get(left)){
            max = left;
        }
        if(right < list.size() && list.get(max) < list.get(right)){
            max = right;
        }
        if( max != i){
            swap(max,i);
            downheap(max);
        }
    }

    private int right(int i) {
        return 2 * i +2;
    }

    private int left(int i) {
        return 2 * i +1;
    }

    private void upheap(int i) {
        if(i == 0) return;
        int p = parent(i);
        if(list.get(i) > list.get(p)){
            swap(i,p);
            upheap(p);
        }
    }

    private void swap(int i, int p) {
        int temp = list.get(i);
        list.set(i, list.get(p));
        list.set(p,temp);
    }

    private int parent(int i) {
        return (i-1)/2;
    }

    public static void main(String[] args) {
        MaxHeap max = new MaxHeap();
        max.insert(12);
        max.insert(32);
        max.insert(6);
        max.insert(11);
        max.insert(9);
        System.out.println(list);
        System.out.println(max.delete());
        System.out.println(list);
    }
}
