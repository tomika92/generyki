import java.util.Iterator;
import java.util.function.Consumer;
public class LinkedList <T> implements Iterable<T>{
    private Node<T> head;
    public LinkedList() {
        this.head = null;
    }
    public Node<T> getHead() {
        return head;
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }
    public void add(T data){
        if(this.head == null){
            this.head = new Node<T>(data);
        }
        else{
            Node<T> x = new Node<T>(data);
            Node<T> lastNode = this.head;
            while(lastNode.getNextNode() != null){
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(x);
        }
    }
    public boolean contains(T data){
        Node<T> lastNode = this.head;
        while(!lastNode.getData().equals(data)){
            if(lastNode.getNextNode() == null){
                return false;
            }
            lastNode = lastNode.getNextNode();
        }
        return true;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }
            @Override
            public T next() {
                T returnData = currentNode.getData();
                if(currentNode != null){
                    currentNode = currentNode.getNextNode();
                }
                return returnData;
            }
        };
    }
    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        boolean z;
        l.add(4);
        l.add(10);
        l.add(7);
//l.disp();
        z = l.contains(4);
        System.out.println(z);
        z = l.contains(5);
        System.out.println(z);
        Iterator<Integer> interator = l.iterator();
        while(interator.hasNext()){
            System.out.println(interator.next());
        }
    }
}