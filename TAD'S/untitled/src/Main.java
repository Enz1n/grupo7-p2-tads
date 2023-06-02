import uy.edu.um.adt.linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(99);

        list.remove(1);



        System.out.println("El Size de la lista es de: " + list.size() + " digitos");
        System.out.println("La Lista:");
        list.print();

        int position = 0;
        System.out.println("El Numero en la posicion (" + position + ") es: " + list.get(position));

    }
}