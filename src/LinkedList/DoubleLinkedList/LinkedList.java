package LinkedList.DoubleLinkedList;



public interface LinkedList {

    void insertFirst(int value);

    void insertLast(int value);

    void insert(int value,int index);

    void display();

    void displayRev();

    int deleteFirst();

    int deleteLast();

    int delete(int index);

    int size();

    DoubleLL.Node get(int index);

//    void update(int value, int index);
}
