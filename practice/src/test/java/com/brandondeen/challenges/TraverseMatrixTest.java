package com.brandondeen.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TraverseMatrixTest {

    TraverseMatrix obj = new TraverseMatrix();
    int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    void testTraverseForwardDiagonal() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{1,5,9}));
        List<Integer> actual = obj.traverseForwardDiagonal(this.matrix1);
        Assertions.assertAll("",
                () -> Assertions.assertEquals(expected.size(), actual.size()),
                () -> Assertions.assertTrue(expected.containsAll(actual))
        );
    }

    @Test
    void testTraverseReverseDiagonal() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{7,5,3}));
        List<Integer> actual = obj.traverseReverseDiagonal(this.matrix1);
                Assertions.assertAll("",
                        () -> Assertions.assertEquals(expected.size(), actual.size()),
                        () -> Assertions.assertTrue(expected.containsAll(actual)),
                        () -> Assertions.assertEquals(expected, actual)
        );
    }
}