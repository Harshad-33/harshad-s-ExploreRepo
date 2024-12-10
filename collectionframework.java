import java.lang.classfile.instruction.ConstantInstruction.IntrinsicConstantInstruction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class collectionframework {
    public static void main(String[] args) {
        // //list
        // List <Integer>list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(2, 50);
        // //list.add("hashsad");//for run this you need to remove [<Integer>] , then i will execute
        // System.out.println(list);


        // //ArrayList(fast)
        // ArrayList<Integer>list = new ArrayList<>();
        // list.add(15);
        // list.add(20);
        // list.add(25);
        // list.add(2, 35);
        // System.out.println(list);


        // //LinkedList
        // List linkedList = new LinkedList<>();
        // linkedList.add(0, 20);
        // linkedList.add(10);
        // linkedList.add(1, 50);
        // System.out.println(linkedList);
        // linkedList.remove(1);
        // System.out.println(linkedList);


        // //vector(slow)
        // Vector<String> vector = new Vector<String>();
        // vector.add("5");
        // vector.add("10");
        // vector.add("15");
        // System.out.println(vector);
        // vector.clear();
        // System.out.println(vector);


        // //Stack
        // Stack<Integer> stack = new Stack<Integer>();
        // stack.push(15);
        // stack.push(20);
        // stack.push(25);
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack.peek());


        // //Hashset[not have any order , it take unique no, ex.contact list ]
        // Set<Integer>set = new HashSet<Integer>();
        // set.add(10);
        // set.add(15);
        // set.add(20);
        // set.add(25);
        // set.add(80);
        // System.out.println(set);


        // //linkedHashSet[in sequence order as per input]
        // LinkedHashSet<Integer> llset = new LinkedHashSet<Integer>();
        // llset.add(5);
        // llset.add(10);
        // llset.add(15);
        // llset.add(20);
        // llset.add(10);
        // System.out.println(llset);
        // boolean b1 = llset.contains(15);
        // System.out.println(b1);


        // //TreeSet[assending order]
        // TreeSet<Integer>tset = new TreeSet<Integer>();
        // tset.add(20);
        // tset.add(25);
        // tset.add(30);
        // tset.add(35);
        // tset.add(10);
        // tset.add(5);
        // System.out.println(tset);


        // //Queue using linkedlist
        // Queue<Integer>queue = new LinkedList<Integer>();
        // queue.add(10);
        // queue.offer(20);
        // queue.offer(25);
        // queue.offer(35);
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue);


        // //Queue using priority queue
        // Deque<Integer> dque = new ArrayDeque<Integer>();
        // dque.offer(10);
        // dque.offer(15);
        // dque.offerLast(80);
        // dque.offer(20);
        // dque.pollFirst();
        // dque.pollLast();
        // dque.offerFirst(5);
        // dque.offer(30);
        // System.out.println(dque);


        // //PriorityQueue
        // PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());//for reverse order
        // pq.offer(12);
        // pq.add(3);
        // pq.add(5);
        // pq.offer(2);
        // System.out.println(pq.peek());
        // System.out.println(pq);
        // System.out.println(pq.remove());
        // System.out.println(pq);
        // System.out.println(pq.peek());


        // PriorityQueue<Integer>pqu = new PriorityQueue<>();
        // pqu.offer(12);
        // pqu.add(3);
        // pqu.add(5);
        // pqu.offer(2);
        // System.out.println(pqu.peek());
        // System.out.println(pqu);
        // System.out.println(pqu.remove());
        // System.out.println(pqu);
        // System.out.println(pqu.peek());


        // //HashMap
        // HashMap<String,Integer> map = new HashMap<String,Integer>();
        // map.put("Second", 20);
        // map.put("First", 5);
        // System.out.println(map);


        // int arr[] = {1,23,5,36,10,15};
        // for(int e : arr)
        //     Arrays.sort(arr);
        //     System.out.println();
        //     for(int e: arr)
        //     System.out.print(e+",");
        //     System.out.println(Arrays.binarySearch(arr, 15));
        //     ArrayList<String>myList = new ArrayList<>();
        //     myList.add("Second");
        //     myList.add("First");
        //     myList.add("Third");
        //     System.out.println(myList);
        //     Collections.sort(myList);
        //     System.out.println("Max = "+Collections.max(list)); //enable list to run this
        //     System.out.println(myList);
        //     Iterator it = myList.iterator();
        //     while (it.hasNext()) {
        //         System.out.println(it.next());
        //     }
    }
}
