package inhertience;

public class Inheritence2 extends Inhertience1{
    int age;
    public Inheritence2(int money, int age,int ag) {
        super(money, age);
        this.age= ag;
    }
    void printAge(){
        System.out.println(this.age);
        System.out.println("parent class age is "+super.getAge());
    }
}
