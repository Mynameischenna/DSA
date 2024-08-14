package Generics;

public class ComparableObjects implements Comparable<ComparableObjects>{
    int marks;
    String name;

    public ComparableObjects(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableObjects o) {
        System.out.println("hllo boss");
        return this.marks - o.marks;
    }
}
