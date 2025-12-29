import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Collectiondemo {
    public static void main(String[] args) {

        LinkedList<Integer> ar = new LinkedList<>();
        ar.add(10);
        ar.add(11);
        ar.add(12);
        ar.remove(1);
        Stack<String> stack1 = new Stack<>();
        stack1.push("Siddhant");
        stack1.peek();

        for(int n : ar){
            System.out.println(n);
        }
        PriorityQueue priorityQueue = new PriorityQueue();

    }
}
