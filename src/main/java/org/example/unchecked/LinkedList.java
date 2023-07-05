package org.example.unchecked;

import lombok.Getter;
import lombok.Setter;

@Getter
public class LinkedList {
    private Node node;

    public LinkedList() {
        this.node = null;
    }

    public static void main(String[] args) {
        final Node list = createList();
        outputList(list);

        Node reversedList = reverseList(list);
        outputList(reversedList);
    }

    public static Node createList() {
        Node node = new Node(8);
        node.setNext(new Node(11));

        Node firstElement = node.getNext();
        firstElement.setNext(new Node(12));

        Node secondElement = firstElement.getNext();
        secondElement.setNext(new Node(15));
        return node;
    }

    public static Node reverseList(Node list) {

        Node current = list;
        Node next;
        Node previous = null;

        while (current != null) {
            next = current.next;
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void outputList(Node list) {
        System.out.print(list.getValue() + " ");

        Node current = list.getNext();
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

}

@Getter
@Setter
class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
