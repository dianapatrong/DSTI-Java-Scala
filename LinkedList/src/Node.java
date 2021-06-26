public class Node<O> {
    private Node<O> next;
    private O value;

    public Node(){
    }

    public Node(O value){
        this.value = value;
    }

    public Node(Node<O> next, O value){
        this.next = next;
        this.value = value;
    }

    public O getValue(){
        return this.value;
    }

    public void setValue(O value){
        this.value = value;
    }

    public void setNext(Node<O> n){
        this.next = n;
    }

    public Node<O> getNext(){
        return this.next;
    }


}
