import org.junit.jupiter.api.Test;
import task2.AVLTree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TaskTest2 {
    @Test
    public void compareTraces() {
        AVLTree tree = new AVLTree();

        final int[] input = {23, 16, 15, 4, 7, 1, 5, 14, 8, 6, 12, 22, 9, 19, 2, 17, 13, 11, 0, 10};
        final int[] raw_exp = {9, 4, 1, 0, 2, 5, 14, 11, 10, 12, 13, 19, 16, 15, 17, 22, 23};
        for (int j : input) tree.insertNode(j);

        ArrayList<Integer> expectedValue = new ArrayList<>();
        for (int j : raw_exp) expectedValue.add(j);

        tree.deleteNode(8);
        tree.deleteNode(7);
        tree.deleteNode(6);

        ArrayList<Integer> receivedValue = new ArrayList<>();
        tree.printTree(tree.getRoot(), receivedValue);

        for (Integer i : receivedValue) System.out.print(i + " ");

        assertEquals(expectedValue, receivedValue);
    }
}
