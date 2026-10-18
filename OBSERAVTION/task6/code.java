package tasks;

import java.util.*;

public class CollectionFrameworkDemo {

    public static void main(String[] args) {

        // =====================================================
        // 1. COLLECTION AND LIST INTERFACE
        // =====================================================

        System.out.println("===== COLLECTION AND LIST =====");

        List<String> list = new ArrayList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("List: " + list);

        // add(index, element)
        list.add(1, "Orange");
        System.out.println("After add(1, Orange): " + list);

        // addAll()
        List<String> extra = new ArrayList<>();
        extra.add("Grapes");
        extra.add("Pineapple");

        list.addAll(extra);
        System.out.println("After addAll(): " + list);

        // get()
        System.out.println("Element at index 2: " + list.get(2));

        // set()
        list.set(2, "Watermelon");
        System.out.println("After set(): " + list);

        // contains()
        System.out.println("Contains Mango: "
                + list.contains("Mango"));

        // containsAll()
        System.out.println("Contains all extra elements: "
                + list.containsAll(extra));

        // indexOf()
        System.out.println("First index of Apple: "
                + list.indexOf("Apple"));

        // lastIndexOf()
        System.out.println("Last index of Apple: "
                + list.lastIndexOf("Apple"));

        // size()
        System.out.println("Size: " + list.size());

        // subList()
        System.out.println("SubList: "
                + list.subList(1, 4));

        // sort()
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);

        // remove(Object)
        list.remove("Apple");
        System.out.println("After remove(Apple): " + list);

        // remove(index)
        list.remove(0);
        System.out.println("After remove(0): " + list);


        // =====================================================
        // 2. SET INTERFACE
        // =====================================================

        System.out.println("\n===== SET =====");

        Set<Integer> set = new HashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("Set: " + set);

        System.out.println("Contains 20: "
                + set.contains(20));

        System.out.println("Set Size: " + set.size());

        set.remove(30);
        System.out.println("After remove(30): " + set);

        System.out.println("Is Set Empty: "
                + set.isEmpty());

        set.clear();
        System.out.println("After clear(): " + set);


        // =====================================================
        // 3. SORTED SET AND NAVIGABLE SET
        // =====================================================

        System.out.println("\n===== SORTED SET / NAVIGABLE SET =====");

        NavigableSet<Integer> numbers =
                new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("TreeSet: " + numbers);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        System.out.println("HeadSet(30): "
                + numbers.headSet(30));

        System.out.println("TailSet(30): "
                + numbers.tailSet(30));

        System.out.println("SubSet(20, 50): "
                + numbers.subSet(20, 50));

        System.out.println("Lower(30): "
                + numbers.lower(30));

        System.out.println("Floor(30): "
                + numbers.floor(30));

        System.out.println("Ceiling(35): "
                + numbers.ceiling(35));

        System.out.println("Higher(30): "
                + numbers.higher(30));

        System.out.println("Descending Set: "
                + numbers.descendingSet());

        System.out.println("Poll First: "
                + numbers.pollFirst());

        System.out.println("Poll Last: "
                + numbers.pollLast());

        System.out.println("After polling: " + numbers);


        // =====================================================
        // 4. QUEUE
        // =====================================================

        System.out.println("\n===== QUEUE =====");

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove: " + queue.remove());
        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after operations: "
                + queue);


        // =====================================================
        // 5. DEQUE
        // =====================================================

        System.out.println("\n===== DEQUE =====");

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");
        deque.addLast("C");
        deque.offerFirst("A");
        deque.offerLast("D");

        System.out.println("Deque: " + deque);

        System.out.println("Peek First: "
                + deque.peekFirst());

        System.out.println("Peek Last: "
                + deque.peekLast());

        System.out.println("Remove First: "
                + deque.removeFirst());

        System.out.println("Remove Last: "
                + deque.removeLast());

        System.out.println("Poll First: "
                + deque.pollFirst());

        System.out.println("Poll Last: "
                + deque.pollLast());

        System.out.println("Deque after operations: "
                + deque);


        // =====================================================
        // 6. MAP INTERFACE
        // =====================================================

        System.out.println("\n===== MAP =====");

        Map<Integer, String> map =
                new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Priya");
        map.put(103, "Akshaya");

        System.out.println("Map: " + map);

        System.out.println("Value for key 102: "
                + map.get(102));

        System.out.println("Contains key 101: "
                + map.containsKey(101));

        System.out.println("Contains value Rahul: "
                + map.containsValue("Rahul"));

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Entries: " + map.entrySet());

        System.out.println("Map Size: " + map.size());

        map.remove(103);
        System.out.println("After remove(103): " + map);

        System.out.println("Is Map Empty: "
                + map.isEmpty());


        // =====================================================
        // 7. SORTED MAP / NAVIGABLE MAP
        // =====================================================

        System.out.println("\n===== SORTED MAP / NAVIGABLE MAP =====");

        NavigableMap<Integer, String> treeMap =
                new TreeMap<>();

        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        System.out.println("TreeMap: " + treeMap);

        System.out.println("First Key: "
                + treeMap.firstKey());

        System.out.println("Last Key: "
                + treeMap.lastKey());

        System.out.println("HeadMap(30): "
                + treeMap.headMap(30));

        System.out.println("TailMap(30): "
                + treeMap.tailMap(30));

        System.out.println("SubMap(20, 50): "
                + treeMap.subMap(20, 50));

        System.out.println("Lower Key(30): "
                + treeMap.lowerKey(30));

        System.out.println("Floor Key(30): "
                + treeMap.floorKey(30));

        System.out.println("Ceiling Key(35): "
                + treeMap.ceilingKey(35));

        System.out.println("Higher Key(30): "
                + treeMap.higherKey(30));

        System.out.println("First Entry: "
                + treeMap.firstEntry());

        System.out.println("Last Entry: "
                + treeMap.lastEntry());

        System.out.println("Descending Map: "
                + treeMap.descendingMap());

        System.out.println("Poll First Entry: "
                + treeMap.pollFirstEntry());

        System.out.println("Poll Last Entry: "
                + treeMap.pollLastEntry());

        System.out.println("After polling: "
                + treeMap);


        // =====================================================
        // 8. ITERATOR
        // =====================================================

        System.out.println("\n===== ITERATOR =====");

        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Akshaya");
        names.add("Kiran");

        Iterator<String> iterator =
                names.iterator();

        System.out.println("Using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // =====================================================
        // 9. LIST ITERATOR
        // =====================================================

        System.out.println("\n===== LIST ITERATOR =====");

        ListIterator<String> listIterator =
                names.listIterator();

        System.out.println("Forward Traversal:");

        while (listIterator.hasNext()) {
            System.out.println(
                    listIterator.next()
            );
        }

        System.out.println("Backward Traversal:");

        while (listIterator.hasPrevious()) {
            System.out.println(
                    listIterator.previous()
            );
        }

        System.out.println("\nNext Index: "
                + listIterator.nextIndex());

        System.out.println("Previous Index: "
                + listIterator.previousIndex());

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}
