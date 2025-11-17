package opps;

public class basic {
  public static void main(String args[]){
      Pen p1 = new Pen();
    p1.setColor("red");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color = "Yellow";
    System.out.println(p1.color);



    BankAccount myAcc = new BankAccount();
    myAcc.userName = "LinkunJena";
    myAcc.setPassword("Litu");
    System.out.println(myAcc.userName);
      System.out.println(myAcc.password);


      pencile p2 = new pencile();
      p2.setColor("Yellow");
      System.out.println(p2.color);
      p2.setTip(54);
      System.out.println(p2.tip);

  

  }
}
 class Pen{
    String color;
    int tip;
    void setColor(String newColor){
      color = newColor;
    }
     void setTip (int newTip){
      tip = newTip;
     }
  }

 class BankAccount{
    public String userName;
    public String password;

    public void setPassword(String pwd){
      password = pwd;
    }
  }


  class pencile{
    public String color;
    public int tip;

    String getColor(){
      return this.color;
    }
    int getTip(){
      return this.tip;
    }
    void setColor(String newColor){
      this.color = newColor;
    }
    void setTip(int tip){
      this.tip = tip;
    }
  }

   

