package practice.algorithm;

public class SearchInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean flag = new SearchInMatrix().searchMatrix(matrix, 20);
        System.out.println(flag);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowEnd = matrix.length;
        int columnEnd = matrix[0].length;
        if (rowEnd == 0) {
            return false;
        }
        int rowStart = 0;
        int columnStart = 0;
        return searchMatrix(matrix, target, rowStart, rowEnd - 1, columnStart, columnEnd - 1);
    }

    public boolean searchMatrix(int[][] matrix, int target, int rowStart, int rowEnd, int columnStart, int columnEnd) {
        if (rowEnd < rowStart || columnEnd < columnStart) {
            return false;
        }
        int rowPivot = (rowStart + rowEnd) / 2;
        int columnPivot = (columnStart + columnEnd) / 2;
        int pivotValue = matrix[rowPivot][columnPivot];
        if (target == pivotValue) {
            return true;
        }

        if (pivotValue < target) {
            return searchMatrix(matrix, target, rowPivot + 1, rowEnd, columnPivot + 1, columnEnd);
        } else {
            return searchMatrix(matrix, target, rowStart, rowPivot - 1, columnStart, columnPivot - 1);
        }

    }
}

