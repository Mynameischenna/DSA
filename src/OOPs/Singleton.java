package OOPs;

public class Singleton {
   private Singleton(){

   }
  static Singleton instance;
   public static Singleton getInstance(){
       // since it is a static methjod i cant use non static stuff
       if(instance==null){
          instance = new Singleton();// since i am using from same class i can use private constructor
       }
       return instance;
   }
}
