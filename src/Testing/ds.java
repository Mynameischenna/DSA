package Testing;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ds {
    static int[] arr = {2,4,1,6,8,95,14};
    static ArrayList<Integer> list;
    ds(){
        list = new ArrayList<>();
    }
    int parent(int i){
        return (i-1)/2;
    }
    int left(int i){
        return 2 * i + 1;
    }
    int right(int i){
        return 2 * i + 2;
    }
    void heapify(){
        for(int i = arr.length/2 -1 ;i>=0;i--){
            downheap(i);
        }
    }
//    this is for normal array
//    void swap(int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    for list type
    void swap(int i,int j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
        }
        // for normal arrays
//    private void downheap(int i) {
//        int min = i;
//        int left = left(i);
//        int right = right(i);
//
//        if(left < arr.length && arr[left] <  arr[min] ){
//            min = left;
//        }
//        if(right < arr.length && arr[right] < arr[min]){
//            min = right;
//        }
//
//        if(min != i){
//            swap(i,min);
//            downheap(min);
//        }
//
//    }
    void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }
    int remove(){
        int delItem = list.get(0);
        int last = list.removeLast();
        list.set(0,last);
        downheap(0);
        return delItem;
    }
    // insert elements
    //up heap ot bottom up approach // min heap
    public void upheap(int i){
//        int last = list.size()-1;
        int p = parent(i);
        if(list.get(i) < list.get(p)){
            swap(i,p);
            upheap(p);
        }
    }
    // downheap for list elements
    void downheap(int i){
        int min = i;
        int left = left(i);
        int right = right(i);

        if(left < list.size() && list.get(left) <  list.get(min) ){
            min = left;
        }
        if(right < list.size() && list.get(right) <  list.get(min)){
            min = right;
        }

        if(min != i){
            swap(i,min);
            downheap(min);
        }

    }
    public static void main(String[] args) {
        ds d = new ds();
//        d.heapify();
//        System.out.println(Arrays.toString(arr));
        d.insert(21);
        d.insert(6);
        d.insert(2);
        d.insert(1);
        d.insert(0);
        System.out.println(d.remove());
        System.out.println(list);
//        System.out.println(list);
    }
}
