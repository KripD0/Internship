package org.example.unchecked;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@RequiredArgsConstructor
class Node {
    private Node left;
    private Node right;
    private final int value;

}
@Getter
public class Tree {

    private Node node;

    public static void main(String[] args) {

        Tree tree = createTree();

        System.out.println("Прямой обход.");
        tree.preorder(tree.node);


        System.out.println("\nОбратный обход.");
        tree.postorder(tree.node);

        System.out.println("\nСиметиричный обход.");
        tree.inorder(tree.node);

        System.out.println("\nОбход в ширину.");
        tree.treeTraversal(tree.node);
    }

    public static Tree createTree() {
        Tree tree = new Tree();

        tree.node = new Node(10);

        tree.node.setLeft(new Node(11));
        tree.node.setRight(new Node(7));

        Node firstBranchLeft = tree.node.getLeft();
        Node firstBranchRight = tree.node.getRight();

        firstBranchLeft.setLeft(new Node(8));
        firstBranchLeft.setRight(new Node(5));

        firstBranchRight.setLeft(new Node(0));
        firstBranchRight.setRight(new Node(20));

        return tree;
    }

    public String preorder(Node node) {
        if (node == null) {
            return null;
        }

        System.out.print(node.getValue() + " ");

        preorder(node.getLeft());

        preorder(node.getRight());

        return "";
    }

    public String postorder(Node node) {
        if (node == null) {
            return "null";
        }

        postorder(node.getLeft());

        postorder(node.getRight());

        System.out.print(node.getValue() + " ");

        return "";
    }

    public String inorder(Node node) {
        if (node == null) {
            return "null";
        }

        inorder(node.getLeft());

        System.out.print(node.getValue() + " ");

        inorder(node.getRight());

        return "";
    }

    public List<Integer> treeTraversal(Node node) {
        if (node == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {

            Node currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");
            list.add(currentNode.getValue());

            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }
        }
        return list;
    }
}
