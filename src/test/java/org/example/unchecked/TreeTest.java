package org.example.unchecked;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void treeTraversal() {

        Tree tree = Tree.createTree();

        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 11, 7, 8, 5, 0, 20));

        assertEquals(expected, tree.treeTraversal(tree.getNode()));
    }
}