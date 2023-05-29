package org.example.unchecked;

import lombok.Getter;
import lombok.Setter;


public class LinkedList {
    private Node node;

    public LinkedList(){
        this.node = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.node = new Node(8);

        list.node.setNext(new Node(11));

        Node firstElement = list.node.getNext();

        firstElement.setNext(new Node(12));

        Node secondElement = firstElement.getNext();

        secondElement.setNext(new Node(15));

        secondElement.getNext();
    }

}
@Getter
@Setter
class Node {
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}
