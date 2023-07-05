package org.example.old;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {

    @Test
    void treeTraversal() {

        Tree tree = Tree.createTree();

        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 11, 7, 8, 5, 0, 20));
        assertEquals(expected, tree.treeTraversal(tree.getNode()));
    }

    @Test
    void preorder() {

        Tree tree = Tree.createTree();

        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 11, 8, 5, 7, 0, 20));
        tree.preorder(tree.getNode());
        assertEquals(expected, tree.getPreorderList());
    }

    @Test
    void postorder() {

        Tree tree = Tree.createTree();

        List<Integer> expected = new ArrayList<>(Arrays.asList(8, 5, 11, 0, 20, 7, 10));
        tree.postorder(tree.getNode());
        assertEquals(expected, tree.getPostorderList());
    }

    @Test
    void inorder() {

        Tree tree = Tree.createTree();

        List<Integer> expected = new ArrayList<>(Arrays.asList(8, 11, 5, 10, 0, 7, 20));
        tree.inorder(tree.getNode());
        assertEquals(expected, tree.getInorderList());
    }
}