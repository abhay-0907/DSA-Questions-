package Queue;
import java.util.*;
public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();

        qu.add("Google");
        qu.add("Apple");
        qu.add("Microsoft");
        qu.add("OpenAI");
        qu.add("Nvidia");
        qu.add("Uber");
        qu.add("Netflix");
        qu.add("Intuit");

        System.out.println(qu.peek());
        System.out.println(qu.size());
        System.out.println(qu.remove());
        System.out.println(qu.size());
    }
}
