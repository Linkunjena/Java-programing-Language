import java.util.*;


public class abstractpac {
    public static void main(String args[]){
Horse h = new Horse();
h.eat();
h.walk();
    }
 abstract   static class Animal{
    String color;
    Animal(){
        color = "green";
    }
        void eat(){
            System.out.println("Animal eats");
        }
    abstract  void walk();
    }
  static class Horse extends Animal{
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
   }
}
