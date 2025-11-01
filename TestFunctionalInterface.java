public class TestFunctionalInterface {
    public static void  main(String args[]){
    Functionalinterface greeting = () -> {
        System.out.println("Hello SIddhant");
    };
    greeting.sayHello();
}
}
