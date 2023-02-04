
public class a5 {
    private Node first, last;
    
    public class DoubleLinkedList() {
        first = last = null;
        
    }
 
    public void addFirst(int aValue) {
        final Node currFirst = first;
        final Node newNode = new Node(null, currFirst, aValue);
        first = newNode;
        if(currFirst == null)  // if empty list
            last = newNode;
        else
            currFirst.prev = newNode;
    }
    
    public void addLast(int aValue) {
        final Node currLast = last;
        final Node newNode = new Node(currLast, null, aValue);
        last = newNode;
        if(currLast == null)  // if empty list
            first = newNode;
        else
            currLast.next = newNode;
    }
    
    public int getLast() {
        return last.value;
    }
    
    public int getFirst() {
        return first.value;
    }
    
    private static class Node {
        Node next, prev;
        int value;
        
        public Node(Node aPrev, Node aNext, int aValue) {
            prev = aPrev;
            next = aNext;
            value = aValue;
        }
    }
}