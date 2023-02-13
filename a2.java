public class a2<Item> {
    private int N = 0;
    public int size = 1;
    private Item [] s;

    public DequeTest() {
        s = (Item[]) new Object[size];
    }

    public void resize(int k) {
        Item[] copy = (Item[]) new Object[k];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void addLast(Item item) {
        if (N == s.length)
            resize(2 * s.length);
        s[N++] = item;
    }

    public void addFirst(Item item) {
        Item[] helpArray = (Item[]) new Object[s.length+1];
        int j = 1;
        for (int i = 0; i < s.length; i++) {
            helpArray[j] = s[i];
            j++;
        }
        s = helpArray;
        s[0] = item; // Ошибка
    }

    public void size() {
        for (int i = 0; i < s.length; i++) {
            System.out.println("i: " + i + " "  + s[i]);
        }
    }

    public static void main(String[] args) {
        DequeTest test = new DequeTest();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        Object obj6 = new Object();
        test.addLast(obj1);
        test.addLast(obj2);
        test.addLast(obj3);
        test.addLast(obj4);
        test.addLast(obj5);
        test.addFirst(obj6);
        test.size();
    }
}

// import java.util.ArrayDeque;
// import java.util.LinkedList;
 
// public class a2{
      
//     public static void main(String[] args) {
          
//         LinkedList<String> states = new LinkedList<String>();
//         // стандартное добавление элементов
//         states.add("A");
//         states.addFirst("B"); // добавляем элемент в самое начало
//         states.push("C"); // добавляем элемент в самое начало
//         states.addLast("D"); // добавляем элемент в конец коллекции
//         states.add("E");
        
//         System.out.println(states);
//         // получаем первый элемент без удаления
//         String sFirst = states.getFirst();
//         System.out.println(sFirst);     // Great Britain
//         // получаем последний элемент без удаления
//         String sLast = states.getLast();
//         System.out.println(sLast);      // Italy
         
//         // System.out.printf("Queue size: %d \n", states.size());  // 5
         
//         // перебор коллекции        
//         while(states.peek()!=null){
//             // извлечение c начала
//             System.out.println(states.pop());
//         }
          
//          // очередь из объектов Person
//         ArrayDeque<Person> people = new ArrayDeque<Person>();
//         people.addFirst(new Person("Tom"));
//         people.addLast(new Person("Nick"));
//         // перебор без извлечения
//         for(Person p : people){
          
//             System.out.println(p.getName());
//         }
//     }
// }
// class Person{
      
//     private String name;
//     public Person(String value){
          
//         name=value;
//     }
//     String getName(){return name;}
// }