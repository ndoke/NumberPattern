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

    /**
     * Returns the element at a particular position in a
     * pattern in an efficient way.
     *
     * @param nRowNum row number of the required element
     * @param nColNum column number of the required element
     * @return element at a particular position in a pattern
     */
    public int getCellVallEfficient(int nRowNum, int nColNum) {
        int n = nRowNum - 1, r = nColNum - 1;
        return fact(n) / fact(n - r) / fact(r);
    }

    private int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
