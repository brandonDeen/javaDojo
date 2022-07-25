package com.brandondeen.challenges;

import java.util.ArrayList;
import java.util.List;

public class TraverseMatrix {


    /**
     * moving from top left to bottom right
     * matrix =
     * [1, 2, 3]
     * [4, 5, 6]
     * [7, 8, 9]
     *
     * @param matrix (n x n 2d array)
     * @return [1, 5, 9]
     */
    public List<Integer> traverseForwardDiagonal(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int x = 0, y = 0;
        int endX = matrix.length - 1, endY = matrix[0].length - 1;

        while (x <= endX && y <= endY) {
            result.add(matrix[x][y]);
            x++;
            y++;
        }

        return result;
    }

    /**
     * moves from bottom left to top right
     * matrix =
     * [1, 2, 3]
     * [4, 5, 6]
     * [7, 8, 9]
     *
     * @param matrix (n x n 2d array)
     * @return [7, 5, 3]
     */
    public List<Integer> traverseReverseDiagonal(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int x = matrix.length - 1, y = 0;
        int endX = 0, endY = matrix.length - 1;

        while (x >= endX && y <= endY) {
            result.add(matrix[x][y]);
            x--;
            y++;
        }

        return result;
    }
}
