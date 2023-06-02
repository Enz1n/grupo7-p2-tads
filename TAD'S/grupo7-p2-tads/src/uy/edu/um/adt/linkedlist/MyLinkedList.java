package uy.edu.um.adt.linkedlist;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void add(T value) {
        if (value != null) {
            Node<T> nodeToAdd = new Node<>(value);
            if (first == null) {
                first = nodeToAdd;
                last = nodeToAdd;
            } else {
                last.setNext(nodeToAdd);
                last = nodeToAdd;
            }
        }
    }

    @Override
    public T get(int position) {
        T value = null;
        if (position == 0){
            return first.getValue();
        }
        Node<T> current = first.getNext();
        int size = this.size();
        int posiciones = size - 1;
        for (int i = 1 ; i <= posiciones; i++){
            if (i == position){
                return current.getValue();
            }
            current = current.getNext();
        }
        return value;
    }

    @Override
    public void remove(T value) {
        Node<T> beforeCurrentNode = null;
        Node<T> currentNode = this.first;
        while (currentNode != null && currentNode.getValue() != value) {
            beforeCurrentNode = currentNode;
            currentNode = beforeCurrentNode.getNext();
        }
        if (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                if (currentNode == this.first && currentNode == this.last) {
                    this.first = null;
                } else if (currentNode == this.first) {
                    this.first = currentNode.getNext();
                } else if (currentNode == this.last) {
                    this.last = beforeCurrentNode;
                    this.last.setNext(null);
                } else {
                    beforeCurrentNode.setNext(currentNode.getNext());
                }
            }
        }
    }

    @Override
    public int size() {
        if (first == null){
            return 0;
        }
        else{
            int size = 1;
            Node<T> current = first;
            while (current.getNext() != null){
                size++;
                current = current.getNext();
            }
            return size;
        }
    }
    public void print(){
        Node<T> current = first;
        for (int i = 0 ; i < this.size() ; i++){
            System.out.println(current.getValue());
            if (current.getNext() != null){
                current = current.getNext();
            }
        }
    }

}

