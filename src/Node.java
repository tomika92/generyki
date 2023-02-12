public class Node<T> {
    private T data;
    private Node nextNode;
    Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
    public T getData() {
        return data;
    }
    public Node<T> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}