package com.training;

/**
 * {@link NumberPattern} has methods to calculate the factorial of an
 * integer and return the result in the form of a integer. The
 * {@link NumberPattern#getCellVall(int, int)} calculates the
 * certain number in a particular pattern.
 *
 * @author  Nachiket Doke
 * @since   1.0
 */

public class NumberPattern {
    /**
     * Returns the element at a particular position in a
     * pattern.
     *
     * @param nRowNum row number of the required element
     * @param nColNum column number of the required element
     * @return element at a particular position in a pattern
     */
    public int getCellVall(int nRowNum, int nColNum) {
        int matrix[][] = new int[nRowNum + 1][nColNum + 1];

        for (int i = 0; i < nRowNum; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
            }
        }
        return matrix[nRowNum - 1][nColNum - 1];
    }
}
