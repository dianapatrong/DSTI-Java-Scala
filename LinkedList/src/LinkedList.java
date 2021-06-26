public class LinkedList<T> {
    private Node<T> first;
    private int size;

    public LinkedList() {
    }

    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    public LinkedList(T value){
        this.first = new Node(value);
        this.size =1;
    }

    public int size(){
        return this.size;
    }

    public Node<T> first(){
        return this.first;
    }

    public void add(T value){
        if(first == null){
            this.first=new Node(value);
        }
        else{
            Node<T> target = this.first();
            while(target.getNext() != null){
                target = target.getNext();
            }
            target.setNext(new Node(value));
        }
        this.size++;
    }

    public T get(int index){
        if (index == 0){
            return this.first.getValue();
        }
        else{
            Node<T> target = this.first();
            int count = 0;
            while(target.getNext() != null && count < index){
                target = target.getNext();
                count++;
            }
             return target.getValue();
        }

    }

    public void remove(T target){
        if (this.first == null){
            return;
        }
        else{
            Node<T> test_remove = this.first;
            if (test_remove.getValue() == target){
                this.first = this.first.getNext();
            }
            while(test_remove.getNext() != null){
                Node <T> previous = test_remove;
                test_remove = test_remove.getNext();

                if (test_remove.getValue() == target){
                    previous.setNext(test_remove.getNext());
                }
            }
            this.size--;
        }
    }




}
