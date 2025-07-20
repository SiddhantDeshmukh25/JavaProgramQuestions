import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class predicate {
    public static void main(String[] arags){
        //predicate example(checks condition)
        Predicate<Integer> isEven = num -> num% 2 ==0;
        System.out.println("Is 10 even?" +isEven.test(10)); //true
        System.out.println("Is 7 even?"+isEven.test(7)); //false

        //Consumer Example (takes input and does something, return nothing)
        Consumer<String> greeter = name -> System.out.println("Hello, " + name + "!");
        greeter.accept("Siddhant"); //output will be hello siddhant !

        //
        Supplier<String> coldDrinkSupplier = () -> "here your cold drink";
        System.out.println(coldDrinkSupplier.get()); //output: Here your cold drink
    }
}
