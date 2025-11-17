package opps;

public class cons {
    public static void main(String[] args) {

//         Student s1 = new Student();
//         Student s2 = new Student("Linkun");
//         Student s3 = new Student (101);
//         Student s4  = new Student("Litu", 30);
//         System.out.println(s4.name);
//         System.out.println(s4.roll);
        
       
        
//     }
//   static  class Student {
//         String name;
//         int roll;

//         Student(){
//             System.out.println("constructor is called....");
//         }
//         Student(String name){
//             this.name = name;
//         }
//         Student(int roll){
//             this.roll = roll;
//         }
//         Student(String name, int roll){
//             this.name = name;
//             this.roll = roll;
//         }


Student s1 = new Student();
s1.name = "Linkun";
s1.roll = 500;
s1.password = "abcd";
s1.mark[0] = 100;
s1.mark[1] = 200;
s1.mark[2] = 300;
System.out.println(mark[1]);

System.out.println(s1.name);

    }

  static  class Student{
        String name;
        int roll;
        String password;
        int mark[];
        class Adress{
            String city;
        }

         Student(){
        System.out.println("constructor is called....");

    }
    Student(Student s1 ){
        this.name = s1.name;
        this.roll = s1.roll;
    mark = new mark[3];
    for(int i=0; i<mark.lenght; i++){
        this.mark[i]= s1.mark[i];
    }
    }

    }
   

}
