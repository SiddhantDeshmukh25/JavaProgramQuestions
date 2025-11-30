import static javax.swing.text.html.HTML.Tag.S;

public class Stringdemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
            person.sound();
        Human human = new Human();
        System.out.println(human.name);
        Dog dog = new Dog();{
           dog.sound();
        }
    }
}
interface interf{
    public void m1();
   void m2();
}
class ServiceProvider implements interf{
    @Override
 public void m1() {

    }

    @Override
    public void m2() {

    }
}

//interface concept:
        //Any service rewquirement specification (SRS)
    //
//abstraction
//abstract method
//abstract method, class, interfaces
//

        //no diff in both, both will create object
//        String s1 = new String("Siddhant");
//        String s2 = "Siddhant";
//        System.out.println("return int");
//        return 0;
//        //constructor
//        Demo demo =

    class Person {
        String name;
        int age;
        void sound(){
            System.out.println("Sound");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person() {
            this.name ="Siddhant";
            this.age =10;
        }
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    class Human extends Person{
    public void Male(String name, int age){
        super.name = "Shripad";
    }
    }
    class Dog extends Human{
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

//
//    public static void main( String[] temp) {
//        //no diff in both, both will create object
//        String s1 = new String("Siddhant");
//        String s2 = "Siddhant";
//        System.out.println("return void main");
//    }

//    public static float main(String args) {
//        //no diff in both, both will create object
//        String s1 = new String("Siddhant");
//        String s2 = "Siddhant";
//        System.out.println("return float");
//        return 1.2f;
//    }
//   public int add(int a, int b){
//       return a+ b;
//   }
//   public int add(int a,int b, int c){
//       return a+b+c;
//   }
//   public double add(double a,double b){
//       return a+b;
//   }
//}
//class childclass extends Stringdemo{
//    public double add(double a, double b){
//        return a+ b;
//    }
//   //method variable argument
//    public static void main(String[] args) {
//
//        show(1);
//        show(10,20,30);
//    }
//
//
//    public static void show(int...x){
//        for (int a : x){
//            System.out.println(a);
//        }
//    }
//}









