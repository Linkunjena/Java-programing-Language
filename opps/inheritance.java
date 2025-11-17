package opps;

public class inheritance {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();

        mammal human = new mammal();
        human.breath();
        human.legs = 2;
        System.out.println(human.legs);
        
    }
   static  class Animal{
        String color;

        void eat(){
            System.out.println("eats");

        }
        void breath(){
            System.out.println("Breath");
        }
    }

  static  class Fish extends Animal{
        int fins;

        void swim(){
            System.out.println("swims in water");
        }
    }

    static class mammal extends Animal{
        int legs;
    }
    static class Dog extends mammal {
        String breed;
    }
}
