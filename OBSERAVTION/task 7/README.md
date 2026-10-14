package tasks;

import java.util.*;

public class CollectionFrameworkPart2 {

    public static void main(String[] args) {

        // =====================================================
        // 1. ARRAYLIST
        // =====================================================

        System.out.println("===== ARRAYLIST =====");

        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("ArrayList: " + list);

        // add(index, element)
        list.add(1, "Orange");
        System.out.println("After add(1, Orange): " + list);

        // get()
        System.out.println("Element at index 2: "
                + list.get(2));

        // set()
        list.set(2, "Grapes");
        System.out.println("After set(): " + list);

        // remove(index)
        list.remove(1);
        System.out.println("After remove(1): " + list);

        // remove(Object)
        list.remove("Apple");
        System.out.println("After remove(Apple): " + list);

        // contains()
        System.out.println("Contains Mango: "
                + list.contains("Mango"));

        // size()
        System.out.println("Size: " + list.size());

        // isEmpty()
        System.out.println("Is Empty: "
                + list.isEmpty());

        // indexOf()
        System.out.println("Index of Apple: "
                + list.indexOf("Apple"));

        // lastIndexOf()
        System.out.println("Last Index of Apple: "
                + list.lastIndexOf("Apple"));

        // sort()
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);


        // =====================================================
        // 2. LINKEDLIST
        // =====================================================

        System.out.println("\n===== LINKEDLIST =====");

        LinkedList<String> linkedList =
                new LinkedList<>();

        linkedList.add("B");
        linkedList.add("C");

        System.out.println("LinkedList: "
                + linkedList);

        linkedList.addFirst("A");
        linkedList.addLast("D");

        System.out.println("After addFirst/addLast: "
                + linkedList);

        System.out.println("Element at index 1: "
                + linkedList.get(1));

        System.out.println("First Element: "
                + linkedList.getFirst());

        System.out.println("Last Element: "
                + linkedList.getLast());

        linkedList.offer("E");
        System.out.println("After offer(E): "
                + linkedList);

        System.out.println("Peek: "
                + linkedList.peek());

        System.out.println("Poll: "
                + linkedList.poll());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removeFirst/removeLast: "
                + linkedList);


        // =====================================================
        // 3. VECTOR
        // =====================================================

        System.out.println("\n===== VECTOR =====");

        Vector<String> vector = new Vector<>();

        vector.add("Red");
        vector.add("Blue");

        vector.addElement("Green");

        System.out.println("Vector: " + vector);

        System.out.println("Element at index 1: "
                + vector.get(1));

        vector.set(1, "Yellow");

        System.out.println("After set(): "
                + vector);

        System.out.println("Contains Red: "
                + vector.contains("Red"));

        System.out.println("Size: "
                + vector.size());

        System.out.println("Capacity: "
                + vector.capacity());

        vector.remove(0);

        System.out.println("After remove(0): "
                + vector);

        vector.removeElement("Green");

        System.out.println("After removeElement(Green): "
                + vector);


        // =====================================================
        // 4. STACK
        // =====================================================

        System.out.println("\n===== STACK =====");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Peek: "
                + stack.peek());

        System.out.println("Search 20: "
                + stack.search(20));

        System.out.println("Pop: "
                + stack.pop());

        System.out.println("Stack after pop: "
                + stack);

        System.out.println("Is Empty: "
                + stack.empty());


        // =====================================================
        // 5. HASHSET
        // =====================================================

        System.out.println("\n===== HASHSET =====");

        HashSet<Integer> hashSet =
                new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20);

        System.out.println("HashSet: "
                + hashSet);

        System.out.println("Contains 20: "
                + hashSet.contains(20));

        System.out.println("Size: "
                + hashSet.size());

        hashSet.remove(10);

        System.out.println("After remove(10): "
                + hashSet);

        System.out.println("Is Empty: "
                + hashSet.isEmpty());

        hashSet.clear();

        System.out.println("After clear(): "
                + hashSet);


        // =====================================================
        // 6. LINKEDHASHSET
        // =====================================================

        System.out.println("\n===== LINKEDHASHSET =====");

        LinkedHashSet<String> linkedHashSet =
                new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");

        System.out.println("LinkedHashSet: "
                + linkedHashSet);

        System.out.println("Contains Banana: "
                + linkedHashSet.contains("Banana"));

        System.out.println("Size: "
                + linkedHashSet.size());

        linkedHashSet.remove("Banana");

        System.out.println("After remove(Banana): "
                + linkedHashSet);

        linkedHashSet.clear();

        System.out.println("After clear(): "
                + linkedHashSet);


        // =====================================================
        // 7. TREESET
        // =====================================================

        System.out.println("\n===== TREESET =====");

        TreeSet<Integer> treeSet =
                new TreeSet<>();

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("TreeSet: "
                + treeSet);

        System.out.println("First: "
                + treeSet.first());

        System.out.println("Last: "
                + treeSet.last());

        System.out.println("Higher(30): "
                + treeSet.higher(30));

        System.out.println("Lower(30): "
                + treeSet.lower(30));

        System.out.println("Ceiling(35): "
                + treeSet.ceiling(35));

        System.out.println("Floor(35): "
                + treeSet.floor(35));

        System.out.println("Contains 20: "
                + treeSet.contains(20));

        treeSet.remove(20);

        System.out.println("After remove(20): "
                + treeSet);

        System.out.println("Poll First: "
                + treeSet.pollFirst());

        System.out.println("Poll Last: "
                + treeSet.pollLast());

        System.out.println("After polling: "
                + treeSet);


        // =====================================================
        // 8. PRIORITYQUEUE
        // =====================================================

        System.out.println("\n===== PRIORITYQUEUE =====");

        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.offer(10);
        priorityQueue.add(20);

        System.out.println("PriorityQueue: "
                + priorityQueue);

        System.out.println("Peek: "
                + priorityQueue.peek());

        System.out.println("Contains 20: "
                + priorityQueue.contains(20));

        System.out.println("Size: "
                + priorityQueue.size());

        System.out.println("Poll: "
                + priorityQueue.poll());

        priorityQueue.remove(30);

        System.out.println("After remove(30): "
                + priorityQueue);


        // =====================================================
        // 9. ARRAYDEQUE
        // =====================================================

        System.out.println("\n===== ARRAYDEQUE =====");

        ArrayDeque<String> deque =
                new ArrayDeque<>();

        deque.addFirst("B");
        deque.addLast("C");

        deque.offerFirst("A");
        deque.offerLast("D");

        System.out.println("ArrayDeque: "
                + deque);

        System.out.println("Peek First: "
                + deque.peekFirst());

        System.out.println("Peek Last: "
                + deque.peekLast());

        System.out.println("Poll First: "
                + deque.pollFirst());

        System.out.println("Poll Last: "
                + deque.pollLast());

        System.out.println("ArrayDeque after polling: "
                + deque);


        // =====================================================
        // 10. HASHMAP
        // =====================================================

        System.out.println("\n===== HASHMAP =====");

        HashMap<Integer, String> hashMap =
                new HashMap<>();

        hashMap.put(101, "Rahul");
        hashMap.put(102, "Priya");
        hashMap.put(103, "Akshaya");

        System.out.println("HashMap: "
                + hashMap);

        System.out.println("Value for key 102: "
                + hashMap.get(102));

        System.out.println("Contains key 101: "
                + hashMap.containsKey(101));

        System.out.println("Contains value Rahul: "
                + hashMap.containsValue("Rahul"));

        System.out.println("Keys: "
                + hashMap.keySet());

        System.out.println("Values: "
                + hashMap.values());

        System.out.println("Entries: "
                + hashMap.entrySet());

        System.out.println("Size: "
                + hashMap.size());

        System.out.println("Value for key 999: "
                + hashMap.getOrDefault(999, "Not Found"));

        hashMap.remove(103);

        System.out.println("After remove(103): "
                + hashMap);

        System.out.println("Is Empty: "
                + hashMap.isEmpty());


        // =====================================================
        // 11. LINKEDHASHMAP
        // =====================================================

        System.out.println("\n===== LINKEDHASHMAP =====");

        LinkedHashMap<Integer, String> linkedHashMap =
                new LinkedHashMap<>();

        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");

        System.out.println("LinkedHashMap: "
                + linkedHashMap);

        System.out.println("Value for key 2: "
                + linkedHashMap.get(2));

        System.out.println("Contains key 1: "
                + linkedHashMap.containsKey(1));

        System.out.println("Keys: "
                + linkedHashMap.keySet());

        System.out.println("Values: "
                + linkedHashMap.values());

        System.out.println("Entries: "
                + linkedHashMap.entrySet());

        linkedHashMap.remove(2);

        System.out.println("After remove(2): "
                + linkedHashMap);


        // =====================================================
        // 12. TREEMAP
        // =====================================================

        System.out.println("\n===== TREEMAP =====");

        TreeMap<Integer, String> treeMap =
                new TreeMap<>();

        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        System.out.println("TreeMap: "
                + treeMap);

        System.out.println("Value for key 30: "
                + treeMap.get(30));

        System.out.println("Contains key 20: "
                + treeMap.containsKey(20));

        System.out.println("Contains value Thirty: "
                + treeMap.containsValue("Thirty"));

        System.out.println("First Key: "
                + treeMap.firstKey());

        System.out.println("Last Key: "
                + treeMap.lastKey());

        System.out.println("Higher Key(30): "
                + treeMap.higherKey(30));

        System.out.println("Lower Key(30): "
                + treeMap.lowerKey(30));

        System.out.println("Ceiling Key(35): "
                + treeMap.ceilingKey(35));

        System.out.println("Floor Key(35): "
                + treeMap.floorKey(35));

        System.out.println("Entries: "
                + treeMap.entrySet());

        treeMap.remove(20);

        System.out.println("After remove(20): "
                + treeMap);


        // =====================================================
        // 13. HASHTABLE
        // =====================================================

        System.out.println("\n===== HASHTABLE =====");

        Hashtable<Integer, String> hashtable =
                new Hashtable<>();

        hashtable.put(101, "Java");
        hashtable.put(102, "Python");
        hashtable.put(103, "C++");

        System.out.println("Hashtable: "
                + hashtable);

        System.out.println("Value for key 102: "
                + hashtable.get(102));

        System.out.println("Contains key 101: "
                + hashtable.containsKey(101));

        System.out.println("Contains value Java: "
                + hashtable.containsValue("Java"));

        System.out.println("Keys:");

        Enumeration<Integer> keys =
                hashtable.keys();

        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        System.out.println("Values:");

        Enumeration<String> values =
                hashtable.elements();

        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        System.out.println("Size: "
                + hashtable.size());

        hashtable.remove(103);

        System.out.println("After remove(103): "
                + hashtable);

        System.out.println("Is Empty: "
                + hashtable.isEmpty());


        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}