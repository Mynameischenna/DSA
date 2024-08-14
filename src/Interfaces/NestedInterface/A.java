package Interfaces.NestedInterface;

public class A {
    protected interface iface{
        boolean isOdd(int num);
    }
}
 class B implements A.iface{

     @Override
     public boolean isOdd(int num) {
         return (num & 1) ==1;
     }
 }
// the only diff btw direct interface and Nested interface is :
// nif can be public ,protected or private
// but normal interface can only be public or default