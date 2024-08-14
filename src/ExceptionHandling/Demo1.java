package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import ExceptionHandling.ExceptionClass;

public class Demo1 {
    public static void main(String[] args) {
        try{
//            System.out.println(" i am in try block");
            fun1(2,0);
//            FileReader file = new FileReader("test.txt");
//            System.out.println(" i am in try block after code");
        }

        catch (Exception e) {
            System.out.println(e);
//           e.printStackTrace();
        }
        finally {
            System.out.println( " iam in finally");
        }
        System.out.println("hey i am after finally block");
    }
    static int fun1(int a, int b) throws ExceptionClass{
        if(b==0) throw  new ExceptionClass("dont divide by zero");
        return a/b;
    }
}
