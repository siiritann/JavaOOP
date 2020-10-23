import java.util.*;



public class LinkedList {
    Queue orders = new LinkedList();
    orders.add("Order1");
    orders.add("Order2");
    orders.add("Order3");
    System.out.print(orders.poll());
    System.out.print(orders.poll());
    System.out.print(orders.poll());
}
