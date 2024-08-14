package Generics;
import java.util.List;
import java.util.ArrayList;

public class LowerBoundExample {
    //the unknown type should be higher or equal to super T ion the hierarchy,
    // here unknown type will be type that provided to this function
    public static void addNumbers(List<? super Float> list) {
        list.add(1f); // Allowed
        list.add(2f); // Allowed
        // list.add(new Object()); // Not allowed
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList); // Works with List<Number>

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList); // Works with List<Object>
    }
}

