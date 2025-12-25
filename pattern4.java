public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int trows = n;
        int stars = n;


        for (int rows = 1; rows <= trows; rows++) {

            //spaces

            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            System.out.println();
            stars--;
        }
    }
}


//(n) -> return (n*n);
//
//
////typecast object is reference To avoid typecasting
////
//
//        import java.util.ArrayList;
//import java.util.List;
//
//public class MainDemo {
//
//    public static void main(String[] args) {
//        Demo2<Integer,String> d1 = new Demo2<>();
//        Integer name = d1.name;
//        String id = d1.id;
//
//        Demo2<Float,String> d2 = new Demo2<>();
//        List<String> list = new ArrayList<>();
//    }
//}
class Demo2<T, V> {
    T name;
    V id;

    public V getName(Object type) {
        System.out.println(type);
        return (V) type;
    }

    class Calculator<T extends Number> {
        T num;
    }

    class Siddhant<T, E> {
        public T getMessage(E str) {
            T temp = null;
            return temp;
        }
    }
}