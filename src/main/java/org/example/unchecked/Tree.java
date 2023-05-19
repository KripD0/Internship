package org.example.unchecked;

class Node {
    private Node left;
    private Node right;
    private final int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}
public class Tree {

    private Node node;

    public Tree(){
        this.node = null;
    }

    public static void main(String[] args) {
        Tree tree = createTree();
        tree.preorder(tree.node);
    }

    public static Tree createTree(){
        Tree tree = new Tree();

        tree.node = new Node(10);
        tree.node.setLeft(new Node(11));
        tree.node.setRight(new Node(7));
        tree.node.getLeft().setLeft(new Node(8));
        tree.node.getLeft().setRight(new Node(5));
        tree.node.getRight().setLeft(new Node(0));
        tree.node.getRight().setRight(new Node(20));

        return tree;
    }

    public String preorder(Node node){
        if (node == null){
            return "null";
        }

        System.out.println(node.getValue());

        preorder(node.getLeft());

        preorder(node.getRight());

        return "";
    }
}
