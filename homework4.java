
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.*/

// public class homework4 {
// 	public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
//         System.out.println("Исходный список:" + list);
//         Stack<Integer> list2 = new Stack<>();
//         list2.addAll(list);
//         list.clear();
//         while (!list2.empty())
//             list.add(list2.pop());
//         System.out.println("Перевернутый список: " + list);
//     }
// }




/*Реализуйте очередь с помощью LinkedList 
со следующими методами: enqueue() - помещает элемент 
в конец очереди, dequeue() - возвращает первый элемент 
из очереди и удаляет его, first() - возвращает первый 
элемент из очереди, 
не удаляя.*/

// public class homework4 {
// 	public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();
//         list.add("1 element");
//         System.out.println("Исходный список:" + list);
//         list.addLast("2 element");
//         System.out.println("Исходный список:" + list);
//         list.addFirst("3 element");
//         System.out.println("Исходный список:" + list);
//     }
// }
import java.util.LinkedList;

public class homework4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.addLast("G");
        list.addFirst("A");
        // list.add(1, "A2");
        System.out.println("Содержимое: " + list);

        String val = list.get(0);
        list.add(7, val + "+");
        list.remove(0);
        System.out.println("Содержимое после изменения: " + list);

        list.remove(0);
        System.out.println("Содержимое после изменения: " + list);

        String val1 = list.getLast();
        list.set(0, val1 + "+");
        System.out.println("Содержимое после изменения: " + list + '\n');

        
    }
}
