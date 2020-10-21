package practice.algorithm;

public class SortSquareArr {

  public static void main(String[] args) {
    int[] arr = {-3, -2, -1, 4, 5, 6};
    SortSquareArr main = new SortSquareArr();
    main.sortedSquares(arr);
  }

  public int[] sortedSquares(int[] A) {
    int N = A.length;
    int j = 0;
    while (j < N && A[j] < 0) // [-3, -2, -1, 4, 5, 6]
    j++;
    int i = j - 1;

    int[] ans = new int[N];
    int t = 0;

    while (i >= 0 && j < N) {
      if (A[i] * A[i] < A[j] * A[j]) {
        ans[t++] = A[i] * A[i];
        i--;
      } else {
        ans[t++] = A[j] * A[j];
        j++;
      }
    }

    while (i >= 0) {
      ans[t++] = A[i] * A[i];
      i--;
    }
    while (j < N) {
      ans[t++] = A[j] * A[j];
      j++;
    }

    return ans;
  }
}
