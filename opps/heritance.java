public class heritance {
    public static void main(String[] args) {
        human men = new human();
        men.eat();
        men.walk();
        men.legs = 4;
        System.out.println(men.legs);

        Dear d = new Dear();
        d.eat();
    }
   static  class animal{
        String color;

        void eat(){
            System.out.println("eats anithing");
        }

        void breath(){
            System.out.println("breath");
        }

    }
  static  class human extends animal{
       int legs;

       void walk(){
        System.out.println("human walks in the legs");
       }
    }


  static class Dear extends animal{
    void eat(){
        System.out.println("Eats grass");
    }
  }
}
