package practice.algorithm;

public class RotateArrayLeetCode {
  public static void main(String[] args) {
    //
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    RotateArrayLeetCode rotator = new RotateArrayLeetCode();
    rotator.rotate(arr, 3);
    for (int a : arr) {
      System.out.print(a + " ");
    }
  }

  public void rotate(int[] nums, int k) {
    int length = nums.length;
    while (k > 0) {
      int temp = nums[length - 1];
      for (int i = length - 2; i >= 0; i--) {
        nums[i + 1] = nums[i];
      }
      nums[0] = temp;
      k--;
    }
  }
}
