// class Queue
// {
//     private int[] arr;      // массив для хранения элементов queue
//     private int front;      // front указывает на передний элемент в queue
//     private int rear;       // задняя часть указывает на последний элемент в queue
//     private int capacity;   // максимальная емкость queue
//     private int count;      // текущий размер queue
 
//     // Конструктор для инициализации queue
//     Queue(int size)
//     {
//         arr = new int[size];
//         capacity = size;
//         front = 0;
//         rear = -1;
//         count = 0;
//     }
 
//     // Вспомогательная функция для удаления переднего элемента из очереди
//     public int dequeue()
//     {
//         // проверка на опустошение queue
//         if (isEmpty())
//         {
//             System.out.println("Underflow\nProgram Terminated");
//             System.exit(-1);
//         }
 
//         int x = arr[front];
 
//         System.out.println("Removing " + x);
 
//         front = (front + 1) % capacity;
//         count--;
 
//         return x;
//     }
 
//     // Вспомогательная функция для добавления элемента в queue
//     public void enqueue(int item)
//     {
//         // проверка на переполнение queue
//         if (isFull())
//         {
//             System.out.println("Overflow\nProgram Terminated");
//             System.exit(-1);
//         }
 
//         System.out.println("Inserting " + item);
 
//         rear = (rear + 1) % capacity;
//         arr[rear] = item;
//         count++;
//     }
 
//     // Вспомогательная функция для возврата первого элемента queue
//     public int peek()
//     {
//         if (isEmpty())
//         {
//             System.out.println("Underflow\nProgram Terminated");
//             System.exit(-1);
//         }
//         return arr[front];
//     }
 
//     // Вспомогательная функция для возврата размера queue
//     public int size() {
//         return count;
//     }
 
//     // Вспомогательная функция для проверки, пуста ли queue или нет
//     public boolean isEmpty() {
//         return (size() == 0);
//     }
 
//     // Вспомогательная функция для проверки того, заполнена ли queue или нет
//     public boolean isFull() {
//         return (size() == capacity);
//     }
// }
 
// class Main
// {
//     public static void main (String[] args)
//     {
//         // создаем queue емкостью 5
//         Queue q = new Queue(5);
 
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
 
//         System.out.println("The front element is " + q.peek());
//         q.dequeue();
//         System.out.println("The front element is " + q.peek());
 
//         System.out.println("The queue size is " + q.size());
 
//         q.dequeue();
//         q.dequeue();
 
//         if (q.isEmpty()) {
//             System.out.println("The queue is empty");
//         }
//         else {
//             System.out.println("The queue is not empty");
//         }
//     }
// }


// public class a1 {
//     public static void main(String[] args) {
//         Queue myQueue = new Queue();
//         myQueue.enQueue(3);
//         myQueue.enQueue(2);
//         myQueue.enQueue(1);
//         myQueue.display();
//         myQueue.deQueue();
//         myQueue.peak();
//     }
//     }
//     class Queue {
//       int queueLength = 3;
//       int items[] = new int[queueLength];
//       int front = -1;
//       int back = -1;
//       boolean isFull(){
//           if(back == queueLength - 1){
//               return true;
//           } else {
//               return false;
//           }
//       }
//       boolean isEmpty(){
//           if(front == -1 && back == -1){
//               return true;
//           } else {
//               return false;
//           }
//       }
//        void enQueue(int itemValue) {
//           if(isFull()){
//               System.out.println("Queue is full");
//           } else if(front == -1 && back == -1){
//               front = back = 0;
//               items[back] = itemValue;
//           } else{
//               back++;
//               items[back] = itemValue;
//           }
//       }
//        void deQueue(){
//           if(isEmpty()){
//               System.out.println("Queue is empty. Nothing to dequeue");
//           } else if (front == back){
//               front = back = -1;
//           } else {
//               front++;
//           }
//       }
//       void display(){
//           int i;
//           if(isEmpty()){
//               System.out.println("Queue is empty");
//           } else {
//               for(i = front; i <= back; i++){
//                   System.out.println(items[i]);
//               }
//           }
//       }
//       void peak(){
//           System.out.println("Front value is: " + items[front]);
//       }
//     }

public class a1 {
 
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
 
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);
 
        // myQueue.remove();
        // myQueue.remove();
        // myQueue.remove();
 
        myQueue.insert(60);
 
        // while (!myQueue.isEmpty()) {
        //     int n = myQueue.remove();
        //     System.out.println("Elem: " + n);
        }
 
    }
 
class Queue {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди 
    private int nElem;  // текущее количество элементов в очереди 
    private int front;
    private int rear;
 
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void insert(int elem) {
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }
    
        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }
    
}
// public int remove() {
// int temp = queue[front++]; // получаем первый элемент из очереди
 
//     if (front == maxSize) { // циклический перенос
//         front = 0;
//     }
//     nElem--; // уменьшаем количество элементов в очереди 
//     return temp;
 
//     }
//     public int getFront() {
//         return queue[front];
//     }
     
//     public int getRear() {
//         return queue[rear];
//     }
     
//     public boolean isFull() {
//         return (nElem == maxSize - 1);
//     }
     
//     public boolean isEmpty() {
//         return (nElem == 0);
//     }
     
//     public int getSize() {
//         return nElem;
//     }
// }